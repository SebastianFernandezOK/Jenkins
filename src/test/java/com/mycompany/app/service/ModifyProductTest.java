package com.mycompany.app.service;

import static org.assertj.core.api.Assertions.assertThat;

import com.mycompany.app.domain.Product;
import java.math.BigDecimal;
import org.junit.jupiter.api.Test;

public class ModifyProductTest {

    @Test
    void modifyProduct() {
        // Datos del producto existente
        Long id = 1L;
        String originalName = "Laptop";
        BigDecimal originalPrice = new BigDecimal("999.99");

        // Crear el producto inicial
        Product product = new Product();
        product.setId(id);
        product.setName(originalName);
        product.setPrice(originalPrice);

        // Modificar el producto
        String newName = "New Laptop";
        BigDecimal newPrice = new BigDecimal("1099.99");
        product.setName(newName);
        product.setPrice(newPrice);

        // Verificar que el producto se modificó correctamente
        assertThat(product).isNotNull();
        assertThat(product.getId()).isEqualTo(id);
        assertThat(product.getName()).isEqualTo(newName); // Verificar que el nombre se haya modificado
        assertThat(product.getPrice()).isEqualTo(newPrice); // Verificar que el precio se haya modificado
    }
}
