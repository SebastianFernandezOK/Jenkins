package com.mycompany.app.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.app.domain.Product;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class CreateProductTest {

    @Test
    void createProduct() {
        // Datos del producto
        Long id = 1L;
        String name = "Laptop";
        BigDecimal price = new BigDecimal("999.99");

        // Crear el producto
        Product product = new Product();
        product.setId(id);
        product.setName(name);
        product.setPrice(price);

        // Verificar que el producto se creó correctamente
        assertThat(product).isNotNull();
        assertThat(product.getId()).isEqualTo(id);
        assertThat(product.getName()).isEqualTo(name);
        assertThat(product.getPrice()).isEqualTo(price);
    }
}
