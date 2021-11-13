
package vista;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import accesoADatos.*;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
        
public class VentanaPrincipal extends JFrame implements ActionListener{
    public JPanel pBackground;
    public JPanel panelTablaP;
    public JPanel panelTablaS;
    public JPanel panelbotones;
    public JButton botonP;
    public JButton botonS;
    public JButton botonAgregarP;
    public JButton botonListar;
    public JButton botonactualizar;
    public JButton botonBorrar;
    public JButton borrar;
    public JButton actualizarTa;
    public ventanaRegistro v1;
    public ventanaActualizar v2;
    public JTable tablaP;
    public JTable tablaS;
    public JLabel imagen1;
    public JLabel imagen2;
    public JLabel titulo;
    public JLabel linea;
    public JLabel linea2;
    public participanteDAO participantes;
    public DefaultTableModel modeloT1;
    public DefaultTableModel modeloT2;
   



    public VentanaPrincipal() {
        this.setSize(890,700);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        InicializarComponentes();
    }
    
    public void InicializarComponentes()
    {
        panel();
        tablas();
        etiquetas();
        botones();
        listarT1();
        listarT2();
                
    }
    public void panel(){
        //panel BackGround
        pBackground=new JPanel();
        this.getContentPane().add(pBackground);
        pBackground.setLayout(null);
        pBackground.setBackground(Color.WHITE);
        
        //panel tabla Principal      
        panelTablaP=new JPanel();
        panelTablaP.setLayout(null);
        panelTablaP.setBounds(5, 300, 860, 355);
        panelTablaP.setBackground(Color.WHITE); 
        panelTablaP.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED),"Tabla 1",TitledBorder.LEFT, 
                TitledBorder.DEFAULT_POSITION));
        
        panelTablaP.setVisible(true);
        pBackground.add(panelTablaP);
        
        //panel tabla secundaria
        panelTablaS=new JPanel();
        panelTablaS.setLayout(null);
        panelTablaS.setBounds(5, 300, 860, 355);
        panelTablaS.setBackground(Color.WHITE);
        panelTablaS.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED),"Tabla 2",TitledBorder.LEFT, 
                TitledBorder.DEFAULT_POSITION));
        panelTablaS.setVisible(false);
        pBackground.add(panelTablaS);
        
        //Panel Botones 
        panelbotones=new JPanel();
        panelbotones.setLayout(null);
        panelbotones.setBounds(560, 5, 303, 285);
        panelbotones.setBackground(Color.WHITE);
        panelbotones.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED),"Operaciones",TitledBorder.CENTER, 
                TitledBorder.DEFAULT_POSITION));
        panelbotones.setVisible(true);
        pBackground.add(panelbotones); 

    }
    
    public void etiquetas(){
        
       //imagen dentro del panel de botones
      ImageIcon imagenDraw1 = new ImageIcon("Imagen1.png");
        imagen1=new JLabel();
        imagen1.setBounds(50, 90, 200, 150);
        imagen1.setIcon(new ImageIcon(imagenDraw1.getImage().getScaledInstance(200, 150, Image.SCALE_SMOOTH)));
        panelbotones.add(imagen1);
      
       //imagen superior izquierda
      ImageIcon imagenDraw2 = new ImageIcon("developer.png");
        imagen2=new JLabel();
        imagen2.setBounds(3, 3 , 200, 150);
        imagen2.setIcon(new ImageIcon(imagenDraw2.getImage().getScaledInstance(170, 130, Image.SCALE_SMOOTH)));
        pBackground.add(imagen2);
      
      //Titulo
        titulo=new JLabel();
        titulo.setText("TE RETO A PROGRAMARLO S.A.S");
        titulo.setFont(new Font("Roboto",Font.BOLD, 20));
        titulo.setBounds(180, 35, 400, 60);
        pBackground.add(titulo);
      
      //linea
        linea=new JLabel();
        linea.setText("__________________________________");
        linea.setForeground(new Color(128, 139, 150));
        linea.setFont(new Font("Roboto",Font.BOLD, 20));
        linea.setBounds(180, 45, 400, 60);
        pBackground.add(linea);
      //linea 2
        linea2=new JLabel();
        linea2.setText("__________________________________");
        linea2.setForeground(new Color(128, 139, 150));
        linea2.setFont(new Font("Roboto",Font.BOLD, 20));
        linea2.setBounds(180, 10, 400, 60);
        pBackground.add(linea2);
      
    }
    
    public void botones(){
        //Boton Tabla Principal
        botonP = new JButton();
        botonP.setText("Tabla Principal");
        botonP.setFont(new Font("Roboto", Font.BOLD, 12));
        botonP.setBounds(20, 255, 150, 30);
        botonP.setBackground(new Color(63,137,164));
        botonP.setForeground(Color.WHITE);
        botonP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonP.setVisible(true);
        botonP.addActionListener(this);
        //botonP.setBackground(new Color(170, 183, 184));
        pBackground.add(botonP);
        
        //Boton Tabla Secundaria
        botonS= new JButton();
        botonS.setText("Tabla Secundaria");
        botonS.setBounds(200, 255, 150, 30);
        botonS.setFont(new Font("Roboto", Font.BOLD, 12));
        botonS.setBackground(new Color(63,137,164));
        botonS.setForeground(Color.WHITE);
        botonS.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonS.setVisible(true);
        botonS.addActionListener(this);
        pBackground.add(botonS);
        
        //Boton Buscar
//        ImageIcon bBuscar = new ImageIcon("buscar.png");
//        botonListar = new JButton();
//        botonListar.setText("Buscar");
//        botonListar.setBounds(70, 110, 150, 30);
//        botonListar.setIcon(new ImageIcon(bBuscar.getImage().getScaledInstance(21, 21, Image.SCALE_SMOOTH)));
//        botonListar.setBackground(new Color(128, 139, 150));
//        botonListar.setForeground(Color.WHITE);
//        botonListar.setFont(new Font("Roboto", Font.BOLD, 12));
//        botonListar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
//        botonListar.addActionListener(this);
//        botonListar.setVisible(false);
//        panelbotones.add(botonListar); 

        //Boton Agregar participante
        ImageIcon bagregar = new ImageIcon("agregar.png");
        botonAgregarP=new JButton();
        botonAgregarP.setText("Agregar");
        botonAgregarP.setBounds(70, 50, 150, 30);
        botonAgregarP.setIcon(new ImageIcon(bagregar.getImage().getScaledInstance(32, 32, Image.SCALE_SMOOTH)));
        botonAgregarP.setBackground(new Color(63,137,164));
        botonAgregarP.setForeground(Color.WHITE);
        botonAgregarP.setFont(new Font("Roboto", Font.BOLD, 12));
        botonAgregarP.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonAgregarP.setVisible(true);
        botonAgregarP.addActionListener(this);
        panelbotones.add(botonAgregarP);
        
        //Boton actualizar
        ImageIcon bactualizar = new ImageIcon("actualizar.png");
        botonactualizar=new JButton();
        botonactualizar.setText(" Actualizar");
        botonactualizar.setBounds(70, 120, 150, 30);
        botonactualizar.setIcon(new ImageIcon(bactualizar.getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        botonactualizar.setBackground(new Color(128, 139, 150));
        botonactualizar.setForeground(Color.WHITE);
        botonactualizar.setFont(new Font("Roboto", Font.BOLD, 12));
        botonactualizar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonactualizar.addActionListener(this);
        botonactualizar.setVisible(false); 
        panelbotones.add(botonactualizar);
        
        //Boton borrar 
        ImageIcon bBorrar = new ImageIcon("borrar.png");
        botonBorrar=new JButton();
        botonBorrar.setText(" Borrar   ");
        botonBorrar.setBounds(70, 190, 150, 30);
        botonBorrar.setIcon(new ImageIcon(bBorrar.getImage().getScaledInstance(23, 23, Image.SCALE_SMOOTH)));
        botonBorrar.setBackground(new Color(128, 139, 150));
        botonBorrar.setForeground(Color.WHITE);
        botonBorrar.setFont(new Font("Roboto", Font.BOLD, 12));
        botonBorrar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        botonBorrar.addActionListener(this);
        botonBorrar.setVisible(false);
        panelbotones.add(botonBorrar);
        
        //actualizar tabla 
        actualizarTa= new JButton();
        actualizarTa.setText("Actualizar Tablas");
        actualizarTa.setBounds(380, 255, 150, 30);
        actualizarTa.setFont(new Font("Roboto", Font.BOLD, 12));
        actualizarTa.setBackground(new Color(63,137,164));
        actualizarTa.setForeground(Color.WHITE);
        actualizarTa.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        actualizarTa.setVisible(true);
        actualizarTa.addActionListener(this);
        pBackground.add(actualizarTa);
    }

    public void tablas(){
        
        //tabla panel principal

        modeloT1 = new DefaultTableModel();      
        modeloT1.addColumn("Nombre Usuario");
        modeloT1.addColumn("Nombre");
        modeloT1.addColumn("Apellido");
        modeloT1.addColumn("Celular");   

        tablaP= new JTable(modeloT1);
        tablaP.setBounds(15, 25, 829, 320);
        tablaP.setBackground(Color.WHITE);
        panelTablaP.add(tablaP);
        JScrollPane scrollTablaP = new JScrollPane(tablaP,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTablaP.setBounds(15, 25, 829, 320);
        
        panelTablaP.add(scrollTablaP);
        
        //tabla panel secundario
        
        modeloT2 = new DefaultTableModel();
        modeloT2.addColumn("Nombre Usuario");
        modeloT2.addColumn("Nombre");
        modeloT2.addColumn("Apellido");
        modeloT2.addColumn("Correo Electronico");
        modeloT2.addColumn("Celular");
        modeloT2.addColumn("Clave");
        modeloT2.addColumn("Fecha Nto");
       
        
        tablaS=new JTable(modeloT2);
        tablaS.setBounds(15, 25, 829, 320);
        tablaS.setBackground(Color.WHITE);
        //setEventoMouseClicked(tablaS);
        panelTablaS.add(tablaS);   
        JScrollPane scrollTablaS = new JScrollPane(tablaS,ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        scrollTablaS.setBounds(15,25, 829, 320);
        panelTablaS.add(scrollTablaS);
        
    }
    
    public void listarT1(){
        participantes = new participanteDAO();
        for(int i=0; i< participantes.getParticipantesT1().size();i++){ 
            modeloT1.addRow(participantes.getParticipantesT1().get(i).toArrayTabla1());
        }
    }
    
    public void listarT2 (){
    for(int j=0; j<participantes.getTodosParticipantesT2().size();j++){
            modeloT2.addRow(participantes.getTodosParticipantesT2().get(j).toArrayTabla2());
        }
    } 
    
    void limpiarTablas(){
        
        for(int i= tablaP.getRowCount()-1;i>=0;i--){
            modeloT1.removeRow(i);    
        }
        
        for(int j=tablaS.getRowCount()-1;j>=0;j--){
            modeloT2.removeRow(j);
           
        }
    }
    
    //eventos de los botones
    @Override
   public void actionPerformed(ActionEvent eventos){
       if(eventos.getSource()==botonP ){
           panelTablaP.setVisible(true);
           panelTablaS.setVisible(false);
          // botonListar.setVisible(false);
           botonactualizar.setVisible(false);
           botonBorrar.setVisible(false);
           imagen1.setVisible(true);
           
       }else if(eventos.getSource()==botonS){
           panelTablaS.setVisible(true);
           panelTablaP.setVisible(false);
           //botonListar.setVisible(true);
           botonactualizar.setVisible(true);
           botonBorrar.setVisible(true);
           imagen1.setVisible(false);
       }else if(eventos.getSource()==botonAgregarP){
            v1 = new ventanaRegistro();
            v1.setVisible(true);
           
       }else if(eventos.getSource()==botonactualizar){
           v2 = new ventanaActualizar();
           v2.setVisible(true);
           v2.setLocationRelativeTo(null);
       }else if(eventos.getSource()==actualizarTa){
           limpiarTablas();
           listarT1();
           listarT2();
       }else if(eventos.getSource()==botonBorrar){
          int fila=tablaS.getSelectedRow();
        
            if(fila==-1){
                JOptionPane.showMessageDialog(null, "Usuario no Seleccionado");
            }else{
                String login =tablaS.getValueAt(fila, 0).toString();
                participantes.borrar(login);
            }
            
       }
       
       
   }


}
