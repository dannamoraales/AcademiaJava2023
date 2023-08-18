package com.curso.v0;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SocialMediaTest {

    @Test
    public void testAgregarPublicacion() {
        // Crear un mock de la clase Post
    	Post publicacionMock = Mockito.mock(Post.class);
        Mockito.when(publicacionMock.getContenido()).thenReturn("Contenido de prueba");

        // Crear un usuario y agregar la publicación simulada
        User usuario = new User("Usuario1");
        usuario.agregarPost(publicacionMock);

        // Verificar que la publicación se agregó correctamente
        assertEquals(1, usuario.getPost().size());
        assertEquals("Contenido de prueba", usuario.getPost().get(0).getContenido());
    }
}