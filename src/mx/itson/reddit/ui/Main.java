/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.reddit.ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import mx.itson.reddit.entidades.Comentario;
import mx.itson.reddit.entidades.Comunidad;
import mx.itson.reddit.entidades.Post;
import mx.itson.reddit.entidades.Usuario;

/**
 *
 * @author Jesus Javier Quintero Fierro-240628
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        Post post = new Post();
        Usuario usuario = new Usuario();
        Comunidad comunidad = new Comunidad();
        
        SimpleDateFormat formatoFecha= new SimpleDateFormat("dd-MM-yyyy");
        
        usuario.setNombre("Shadoune666");
        usuario.setPais("Mexico");
        usuario.setPassword("1234");
        usuario.setKarma(34);
        usuario.setCorreo("shadow6512@gmail.com");
        
        comunidad.setNombre("Dragon city");
        
       
        
        Post post1 =new Post();
        Date fecha = formatoFecha.parse("20-03-2003");
        post1.setTitulo("Regalo de epicStore");
        post1.setCuerpo("animal crossing ha sido regalado en Epic Store");
        post1.setUsuario(usuario);
        post1.setFecha(fecha);
        post1.setPuntos(3);
        
        Post post2 =new Post();
        post2.setTitulo("Se viene directo de animal crossing");
        post2.setCuerpo("Directo de animal crossing a las 4 hora de monterrey");
        post2.setUsuario(usuario);
        post2.setFecha(fecha);
        post2.setPuntos(12);
        
        Post post3 =new Post();
        post3.setTitulo("Momentos divertodos de directo");
        post3.setCuerpo("Una pequeña recopilacion de los momentos mas divertidos del directo de hoy");
        post3.setUsuario(usuario);
        post3.setFecha(fecha);
        post3.setPuntos(10);
     
       List<Comentario> comentarios = new ArrayList<>();
       
       Usuario usuario1 = new Usuario();
       Comentario comentario1 = new Comentario();
       usuario1.setNombre("Elpepe98");
       comentario1.setUsuario(usuario1);
       Date fecha1 = formatoFecha.parse("07-12-2003");
       comentario1.setFecha(fecha1);
       comentario1.setCuerpo("¿Cusndo es el limite para reclamar el juego?");
       comentario1.setPuntos(2);
       comentarios.add(comentario1);
       
       Comentario comentario2 = new Comentario();
       Usuario usuario2 = new Usuario();
       usuario2.setNombre("Sarinha_3");
       comentario2.setUsuario(usuario2);
       Date fecha2 = formatoFecha.parse("01-01-2004");
       comentario2.setFecha(fecha2);
       comentario2.setCuerpo("Interesante...");
       comentario2.setPuntos(1);
       comentarios.add(comentario2);
       
       Comentario comentario3 = new Comentario();
       Usuario usuario3 = new Usuario();
       usuario3.setNombre("Elkraber866");
       comentario3.setUsuario(usuario3);
       Date fecha3 = formatoFecha.parse("22-05-2004");
       comentario3.setFecha(fecha3);
       comentario3.setCuerpo("Al fin un buen juego");
       comentario3.setPuntos(0);
       comentarios.add(comentario3);
       
       Comentario comentario4 = new Comentario();
       Usuario usuario4 = new Usuario();
       usuario4.setNombre("Elraber66k");
       comentario4.setUsuario(usuario4);
       Date fecha4 = formatoFecha.parse("26-05-2004");
       comentario4.setFecha(fecha4);
       comentario4.setCuerpo("No podre reclamarlo pipipi");
       comentario4.setPuntos(4);
       comentarios.add(comentario4);
       
       post.setComentarios(comentarios);
       
        System.out.println("---*POSTS DE REDDIT*---");
        System.out.println("Subido por: "+post1.getUsuario().getNombre());
        System.out.println(post1.getTitulo() + "  " + post1.getFecha());
        System.out.println("Comunidad:" + comunidad.getNombre());
        System.out.println("Titulo: " + post1.getTitulo());
        System.out.println(post1.getCuerpo());
        System.out.println("puntos: "+post1.getPuntos());
        System.out.println();
        System.out.println("---*COMENTARIOS*---");
        for(Comentario m : post.getComentarios()){
            System.out.println(m.getUsuario().getNombre());
            System.out.println("-"+m.getCuerpo());
            System.out.println("Fecha: " +m.getFecha() +" puntos: "+m.getPuntos());
            System.out.println("");
        }
       List<Comentario> comentarios2 = new ArrayList<>();
       
       Usuario usuario6 = new Usuario();
       Comentario comentario6 = new Comentario();
       usuario6.setNombre("Elshokas");
       comentario6.setUsuario(usuario6);
       Date fecha6 = formatoFecha.parse("07-12-2003");
       comentario6.setFecha(fecha6);
       comentario6.setCuerpo("¿Cusndo es el directo?");
       comentario6.setPuntos(2);
       comentarios2.add(comentario6);
       
       Comentario comentario5 = new Comentario();
       Usuario usuario5 = new Usuario();
       usuario5.setNombre("Canelita");
       comentario5.setUsuario(usuario5);
       Date fecha5 = formatoFecha.parse("26-05-2004");
       comentario5.setFecha(fecha5);
       comentario5.setCuerpo("Es el dia del platano chicheñol");
       comentario5.setPuntos(10);
       comentarios2.add(comentario5);
       
       Comentario comentario7 = new Comentario();
       Usuario usuario7 = new Usuario();
       usuario7.setNombre("Vegetta777");
       comentario7.setUsuario(usuario7);
       Date fecha7 = formatoFecha.parse("26-05-2004");
       comentario7.setFecha(fecha7);
       comentario7.setCuerpo("Se viene colaboracion");
       comentario7.setPuntos(10);
       comentarios2.add(comentario7);
       
       Comentario comentario8 = new Comentario();
       Usuario usuario8 = new Usuario();
       usuario8.setNombre("Sebas42");
       comentario8.setUsuario(usuario8);
       Date fecha8 = formatoFecha.parse("26-05-2004");
       comentario8.setFecha(fecha8);
       comentario8.setCuerpo("Un buen directito despues del trabajo");
       comentario8.setPuntos(10);
       comentarios2.add(comentario8);
       
       post.setComentarios(comentarios2);
       
        System.out.println("---*POSTS DE REDDIT*---");
        System.out.println("Subido por: "+post2.getUsuario().getNombre());
        System.out.println(post2.getTitulo() + "  " + post2.getFecha());
        System.out.println("Comunidad:" + comunidad.getNombre());
        System.out.println("Titulo: " + post2.getTitulo());
        System.out.println(post2.getCuerpo());
        System.out.println("puntos: "+post2.getPuntos());
        
        System.out.println("---*COMENTARIOS*---");
        for(Comentario m : post.getComentarios()){
            System.out.println(m.getUsuario().getNombre());
            System.out.println("-"+m.getCuerpo());
            System.out.println("Fecha: " +m.getFecha() +" puntos: "+m.getPuntos());
            System.out.println("");
        }
    
    List<Comentario> comentarios3 = new ArrayList<>();
    
       Comentario comentario9 = new Comentario();
       Usuario usuario9 = new Usuario();
       usuario9.setNombre("Canelita");
       comentario9.setUsuario(usuario9);
       Date fecha9 = formatoFecha.parse("26-05-2004");
       comentario9.setFecha(fecha9);
       comentario9.setCuerpo("JAJAAJ no me lo esperaba");
       comentario9.setPuntos(10);
       comentarios3.add(comentario9);
       
       Comentario comentario10 = new Comentario();
       Usuario usuario10 = new Usuario();
       usuario10.setNombre("Elshokas");
       comentario10.setUsuario(usuario10);
       Date fecha10 = formatoFecha.parse("26-05-2004");
       comentario10.setFecha(fecha10);
       comentario10.setCuerpo("lol fue un momento memorable");
       comentario10.setPuntos(10);
       comentarios3.add(comentario10);
       
       Comentario comentario11 = new Comentario();
       Usuario usuario11 = new Usuario();
       usuario11.setNombre("Sebas42");
       comentario11.setUsuario(usuario11);
       Date fecha11 = formatoFecha.parse("26-05-2004");
       comentario11.setFecha(fecha11);
       comentario11.setCuerpo("Que divertido estuvo el directo");
       comentario11.setPuntos(10);
       comentarios3.add(comentario11);
       
       Comentario comentario12 = new Comentario();
       Usuario usuario12 = new Usuario();
       usuario12.setNombre("Vegeta777");
       comentario12.setUsuario(usuario12);
       Date fecha12 = formatoFecha.parse("26-05-2004");
       comentario12.setFecha(fecha12);
       comentario12.setCuerpo("Que momento mas xd fue");
       comentario12.setPuntos(10);
       comentarios3.add(comentario12);
       
       post.setComentarios(comentarios3);
        System.out.println("---*POSTS DE REDDIT*---"); 
        System.out.println("Subido por: "+post3.getUsuario().getNombre());
        System.out.println(post3.getTitulo() + "  " + post3.getFecha());
        System.out.println("Comunidad:" + comunidad.getNombre());
        System.out.println("Titulo: " + post3.getTitulo());
        System.out.println(post3.getCuerpo());
        System.out.println("puntos: "+post3.getPuntos());
        
        System.out.println("---*COMENTARIOS*---");
        for(Comentario m : post.getComentarios()){
            System.out.println(m.getUsuario().getNombre());
            System.out.println("-"+m.getCuerpo());
            System.out.println("Fecha: " +m.getFecha() +" puntos: "+m.getPuntos());
            System.out.println("");
        }
    }
}
