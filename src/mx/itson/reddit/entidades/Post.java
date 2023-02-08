/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Jesus Javier Quintero Fierro-240628
 */
public class Post {
 private Usuario usuario;
 private String titulo;
 private String cuerpo;
 private Date fecha;
 private int puntos;
 private List<Comentario> comentarios;
 private Comunidad comunidad;
}
