package com.example.product_crud_assignment;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @Test
    void createProductSavesAndReturnsProduct() {
        Product product = new Product("Keyboard", 49.99, 8);
        Product savedProduct = new Product(1L, "Keyboard", 49.99, 8);
        when(productRepository.save(product)).thenReturn(savedProduct);

        Product result = productService.createProduct(product);

        assertThat(result).isSameAs(savedProduct);
        verify(productRepository).save(product);
    }

    @Test
    void getAllProductsReturnsRepositoryProducts() {
        List<Product> products = List.of(
                new Product(1L, "Keyboard", 49.99, 8),
                new Product(2L, "Mouse", 24.99, 12)
        );
        when(productRepository.findAll()).thenReturn(products);

        List<Product> result = productService.getAllProducts();

        assertThat(result).containsExactlyElementsOf(products);
        verify(productRepository).findAll();
    }

    @Test
    void getProductByIdReturnsMatchingProduct() {
        Product product = new Product(1L, "Keyboard", 49.99, 8);
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));

        Product result = productService.getProductById(1L);

        assertThat(result).isSameAs(product);
        verify(productRepository).findById(1L);
    }

    @Test
    void getProductByIdThrowsWhenProductDoesNotExist() {
        when(productRepository.findById(99L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> productService.getProductById(99L))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("Product not found");

        verify(productRepository).findById(99L);
    }

    @Test
    void updateProductChangesFieldsAndPreservesId() {
        Product existingProduct = new Product(1L, "Keyboard", 49.99, 8);
        Product requestedUpdate = new Product("Mechanical Keyboard", 89.99, 5);
        when(productRepository.findById(1L)).thenReturn(Optional.of(existingProduct));
        when(productRepository.save(existingProduct)).thenReturn(existingProduct);

        Product result = productService.updateProduct(1L, requestedUpdate);

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getName()).isEqualTo("Mechanical Keyboard");
        assertThat(result.getPrice()).isEqualTo(89.99);
        assertThat(result.getQuantity()).isEqualTo(5);
        verify(productRepository).findById(1L);
        verify(productRepository).save(existingProduct);
    }

    @Test
    void deleteProductDelegatesToRepository() {
        productService.deleteProduct(1L);

        verify(productRepository).deleteById(1L);
    }
}
