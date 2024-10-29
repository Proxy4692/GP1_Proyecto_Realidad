package servicios;

import static conexion.Conexion.getConexion;
import java.sql.Connection;
import modelo.Alimentos;
import modelo.Comidas;
import modelo.Pacientes;


public class TestClasesData {


    public static void main(String[] args) {
        
        System.out.println("El siguiente test prueba todos los atributos de las clases service.");
        System.out.println("Para evitar conflictos al agregar registros duplicados, es importante que");
        System.out.println("previamente la base de datos nutricionista este sin ningun dato.");
        //Testeo de metodos de clase Conexion
        Connection con=getConexion();
        //Testeo de metodos de clase PacientesService
        PacientesService pac=new PacientesService();
        System.out.println(".........................PACIENTE_SERVICE..........................");
        System.out.println();
        //GUARDAR ALUMNO
        Pacientes pac1= new Pacientes("Pedro Martinez",36,1.72,92.4,82.5);
        Pacientes pac2= new Pacientes("Ana Paez",25,1.69,87,80);
        Pacientes pac3= new Pacientes("Jorge Bataglia",28,1.77,89,76);
        Pacientes pac4= new Pacientes("Analía Ortega",36,1.73,79,70);
        Pacientes pac5= new Pacientes("Pablo Benitez",42,1.82,75,73);   
        pac.guardarPaciente(pac1);
        pac.guardarPaciente(pac2);
        pac.guardarPaciente(pac3);
        pac.guardarPaciente(pac4);
        pac.guardarPaciente(pac5);
        System.out.println(".........................GUARDAR PACIENTE - FIN");
        //MODIFICAR PACIENTE
        pac1.setNombre("Gabriel Ortega");
        pac2.setEdad(41);
        pac3.setAltura(1.66);
        pac4.setPesoActual(107);
        pac5.setPesoBuscado(77);
        pac.modificarPaciente(pac1);
        pac.modificarPaciente(pac2);
        pac.modificarPaciente(pac3);
        pac.modificarPaciente(pac4);
        pac.modificarPaciente(pac5);
        System.out.println(".........................MODIFICAR PACIENTE - FIN");
        //BUSCAR PACIENTE
        Pacientes pacB=pac.buscarPaciente(pac5.getNroPaciente());
        System.out.println("BUSCAR PACIENTE id "+pac5.getNroPaciente());
        System.out.println(pacB.toString());
        System.out.println(".........................BUSCAR PACIENTE - FIN");
        //LISTAR PACIENTES
        System.out.println("MOSTRAR LISTA DE PACIENTES ACTIVOS");
        for(Pacientes paciente:pac.listarPaciente()){
            System.out.println(paciente.toString());           
        }
        System.out.println(".........................LISTAR PACIENTES - FIN");
        //ELIMINAR PACIENTE
        int id1 = pac1.getNroPaciente();
        for (int i = id1; i <= (id1 + 4); i++) {
            pac.eliminarPaciente(i);   
        }
        System.out.println("MOSTRAR LISTA DE PACIENTES ACTIVOS");
        for(Pacientes paciente:pac.listarPaciente()){
            System.out.println(paciente.toString());           
        }
        System.out.println(".........................ELIMINAR PACIENTE - FIN");
        //RECUPERAR PACIENTES ELIMINADOS        
        pac.guardarPaciente(pac1);
        pac.guardarPaciente(pac2);
        pac.guardarPaciente(pac3);
        pac.guardarPaciente(pac4);
        pac.guardarPaciente(pac5);
        System.out.println(".........................RECUPERAR PACIENTE ELIMINADO - FIN");
        System.out.println();
        System.out.println();
        
        System.out.println("El siguiente codigo carga la base de datos con Comidas y Alimentos.");

        //Inicializo ComidasService
        ComidasService com=new ComidasService();
        System.out.println(".........................COMIDAS_SERVICE..........................");
        System.out.println();
        //GUARDAR ALIMENTOS
        Alimentos alim1= new Alimentos(1,"almendra",true);
        Alimentos alim2= new Alimentos(2,"arroz",true);
        Alimentos alim3= new Alimentos(3,"avena",true);
        Alimentos alim4= new Alimentos(4,"banana",true);
        Alimentos alim5= new Alimentos(5,"café",true);
        Alimentos alim6= new Alimentos(6,"carne",true);
        Alimentos alim7= new Alimentos(7,"cebolla",true);
        Alimentos alim8= new Alimentos(8,"chocolate",true);
        Alimentos alim9= new Alimentos(9,"durazno",true);
        Alimentos alim10= new Alimentos(10,"fiambre",true);
        Alimentos alim11= new Alimentos(11,"fideos",true);
        Alimentos alim12= new Alimentos(12,"frutas",true);
        Alimentos alim13= new Alimentos(13,"fruto seco",true);
        Alimentos alim14= new Alimentos(14,"huevo",true);
        Alimentos alim15= new Alimentos(15,"kiwi",true);
        Alimentos alim16= new Alimentos(16,"leche",true);
        Alimentos alim17= new Alimentos(17,"leche light",true);
        Alimentos alim18= new Alimentos(18,"lechuga",true);
        Alimentos alim19= new Alimentos(19,"lenteja",true);
        Alimentos alim20= new Alimentos(20,"mandarina",true);
        Alimentos alim21= new Alimentos(21,"manzana",true);
        Alimentos alim22= new Alimentos(22,"mate",true);
        Alimentos alim23= new Alimentos(23,"melon",true);
        Alimentos alim24= new Alimentos(24,"mermelada",true);
        Alimentos alim25= new Alimentos(25,"naranja",true);
        Alimentos alim26= new Alimentos(26,"panificado",true);
        Alimentos alim27= new Alimentos(27,"pepino",true);
        Alimentos alim28= new Alimentos(28,"pera",true);
        Alimentos alim29= new Alimentos(29,"pescado",true);
        Alimentos alim30= new Alimentos(30,"pollo",true);
        Alimentos alim31= new Alimentos(31,"pomelo",true);
        Alimentos alim32= new Alimentos(32,"porotos",true);
        Alimentos alim33= new Alimentos(33,"queso",true);
        Alimentos alim34= new Alimentos(34,"sandía",true);
        Alimentos alim35= new Alimentos(35,"soja",true);
        Alimentos alim36= new Alimentos(36,"te",true);
        Alimentos alim37= new Alimentos(37,"tomate",true);
        Alimentos alim38= new Alimentos(38,"uvas",true);
        Alimentos alim39= new Alimentos(39,"verduras",true);
        Alimentos alim40= new Alimentos(40,"zapallo",true);
        com.cargarAlimentos(alim1);
        com.cargarAlimentos(alim2);
        com.cargarAlimentos(alim3);
        com.cargarAlimentos(alim4);
        com.cargarAlimentos(alim5);
        com.cargarAlimentos(alim6);
        com.cargarAlimentos(alim7);
        com.cargarAlimentos(alim8);
        com.cargarAlimentos(alim9);
        com.cargarAlimentos(alim10);
        com.cargarAlimentos(alim11);
        com.cargarAlimentos(alim12);
        com.cargarAlimentos(alim13);
        com.cargarAlimentos(alim14);
        com.cargarAlimentos(alim15);
        com.cargarAlimentos(alim16);
        com.cargarAlimentos(alim17);
        com.cargarAlimentos(alim18);
        com.cargarAlimentos(alim19);
        com.cargarAlimentos(alim20);
        com.cargarAlimentos(alim21);
        com.cargarAlimentos(alim22);
        com.cargarAlimentos(alim23);
        com.cargarAlimentos(alim24);
        com.cargarAlimentos(alim25);
        com.cargarAlimentos(alim26);
        com.cargarAlimentos(alim27);
        com.cargarAlimentos(alim28);
        com.cargarAlimentos(alim29);
        com.cargarAlimentos(alim30);
        com.cargarAlimentos(alim31);
        com.cargarAlimentos(alim32);
        com.cargarAlimentos(alim33);
        com.cargarAlimentos(alim34);
        com.cargarAlimentos(alim35);
        com.cargarAlimentos(alim36);
        com.cargarAlimentos(alim37);
        com.cargarAlimentos(alim38);
        com.cargarAlimentos(alim39);
        com.cargarAlimentos(alim40);

        //GUARDAR COMIDAS

        Comidas comi1= new Comidas(324, "Almuerzo","Sopa de lentejas",25,false);
        Comidas comi2= new Comidas(327, "Almuerzo","Sopa de verduras",26,false);
        Comidas comi3= new Comidas(334, "Almuerzo","Guiso de lentejas",52,false);
        Comidas comi4= new Comidas(335, "Almuerzo","Sopa de pollo y verduras",60,false);
        Comidas comi5= new Comidas(336, "Almuerzo","Ceviche de pescado",68,false);
        Comidas comi6= new Comidas(337, "Almuerzo","Locro",69,false);
        Comidas comi7= new Comidas(338, "Almuerzo","Sopa de pollo con arroz",78,false);
        Comidas comi8= new Comidas(339, "Almuerzo","Lentejas con chorizo",85,false);
        Comidas comi9= new Comidas(340, "Almuerzo","Arroz con pollo y verduras",99,false);
        Comidas comi10= new Comidas(301, "Almuerzo","Sopa de fideos",100,false);
        Comidas comi11= new Comidas(302, "Almuerzo","Arroz con pollo + ensalada lechuga",102,false);
        Comidas comi12= new Comidas(303, "Almuerzo","Pollo dulce agrio de arroz",105,false);
        Comidas comi13= new Comidas(304, "Almuerzo","Pure de calabaza c/ensalada pepino",109,false);
        Comidas comi14= new Comidas(305, "Almuerzo","Arroz con verduras",111,false);
        Comidas comi15= new Comidas(306, "Almuerzo","Tarta de arroz",116,false);
        Comidas comi16= new Comidas(307, "Almuerzo","Panqueques de avena y banana",118,false);
        Comidas comi17= new Comidas(308, "Almuerzo","Paella",120,false);
        Comidas comi18= new Comidas(309, "Almuerzo","Espaguetis con tomate",129,false);
        Comidas comi19= new Comidas(310, "Almuerzo","Mollejas de pollo c/ensalada mixta",168,false);
        Comidas comi20= new Comidas(311, "Almuerzo","Lasaña",171,false);
        Comidas comi21= new Comidas(312, "Almuerzo","Empanada de jamon y queso",178,false);
        Comidas comi22= new Comidas(313, "Almuerzo","Pastel de carne c/ensalada verduras",179,false);
        Comidas comi23= new Comidas(314, "Almuerzo","Lentejas con arroz",185,false);
        Comidas comi24= new Comidas(315, "Almuerzo","Calabacín relleno c/carne res",187,false);
        Comidas comi25= new Comidas(316, "Almuerzo","Puré de verduras c/carne mechada",195,false);
        Comidas comi26= new Comidas(317, "Almuerzo","Ravioles de verdura",201,false);
        Comidas comi27= new Comidas(318, "Almuerzo","Tarta de carne",204,false);
        Comidas comi28= new Comidas(319, "Almuerzo","Carne asada c/ensalada tomate cebolla",230,false);
        Comidas comi29= new Comidas(320, "Almuerzo","Pollo relleno c/ensalada pepino",235,false);
        Comidas comi30= new Comidas(321, "Almuerzo","Sopa de tortilla",237,false);
        Comidas comi31= new Comidas(322, "Almuerzo","Milanesa de pollo c/ensalada verduras",246,false);
        Comidas comi32= new Comidas(323, "Almuerzo","Sopa de pollo",246,false);
        Comidas comi33= new Comidas(325, "Almuerzo","Caldo de pollo con verduras",250,false);
        Comidas comi34= new Comidas(326, "Almuerzo","Empanada de pescado",256,false);
        Comidas comi35= new Comidas(328, "Almuerzo","Empanada de carne al horno",293,false);
        Comidas comi36= new Comidas(329, "Almuerzo","Carne con tomate",298,false);
        Comidas comi37= new Comidas(330, "Almuerzo","Caldo de carne",323,false);
        Comidas comi38= new Comidas(331, "Almuerzo","Empanada de carne c/ensalada lechuga",342,false);
        Comidas comi39= new Comidas(332, "Almuerzo","Sopa de pollo con fideos",349,false);
        Comidas comi40= new Comidas(333, "Almuerzo","Omelette c/ensalada tomate y cebolla",457,false);
        Comidas comi41= new Comidas(424, "Cena","Sopa de lentejas",25,false);
        Comidas comi42= new Comidas(427, "Cena","Sopa de verduras",26,false);
        Comidas comi43= new Comidas(434, "Cena","Guiso de lentejas",52,false);
        Comidas comi44= new Comidas(435, "Cena","Sopa de pollo y verduras",60,false);
        Comidas comi45= new Comidas(436, "Cena","Ceviche de pescado",68,false);
        Comidas comi46= new Comidas(437, "Cena","Locro",69,false);
        Comidas comi47= new Comidas(438, "Cena","Sopa de pollo con arroz",78,false);
        Comidas comi48= new Comidas(439, "Cena","Lentejas con chorizo",85,false);
        Comidas comi49= new Comidas(440, "Cena","Arroz con pollo y verduras",99,false);
        Comidas comi50= new Comidas(401, "Cena","Sopa de fideos",100,false);
        Comidas comi51= new Comidas(402, "Cena","Arroz con pollo + ensalada lechuga",102,false);
        Comidas comi52= new Comidas(403, "Cena","Pollo dulce agrio de arroz",105,false);
        Comidas comi53= new Comidas(404, "Cena","Pure de calabaza c/ensalada pepino",109,false);
        Comidas comi54= new Comidas(405, "Cena","Arroz con verduras",111,false);
        Comidas comi55= new Comidas(406, "Cena","Tarta de arroz",116,false);
        Comidas comi56= new Comidas(407, "Cena","Panqueques de avena y banana",118,false);
        Comidas comi57= new Comidas(408, "Cena","Paella",120,false);
        Comidas comi58= new Comidas(409, "Cena","Espaguetis con tomate",129,false);
        Comidas comi59= new Comidas(410, "Cena","Mollejas de pollo c/ensalada mixta",168,false);
        Comidas comi60= new Comidas(411, "Cena","Lasaña",171,false);
        Comidas comi61= new Comidas(412, "Cena","Empanada de jamon y queso",178,false);
        Comidas comi62= new Comidas(413, "Cena","Pastel de carne c/ensalada verduras",179,false);
        Comidas comi63= new Comidas(414, "Cena","Lentejas con arroz",185,false);
        Comidas comi64= new Comidas(415, "Cena","Calabacín relleno c/carne res",187,false);
        Comidas comi65= new Comidas(416, "Cena","Puré de verduras c/carne mechada",195,false);
        Comidas comi66= new Comidas(417, "Cena","Ravioles de verdura",201,false);
        Comidas comi67= new Comidas(418, "Cena","Tarta de carne",204,false);
        Comidas comi68= new Comidas(419, "Cena","Carne asada c/ensalada tomate cebolla",230,false);
        Comidas comi69= new Comidas(420, "Cena","Pollo relleno c/ensalada pepino",235,false);
        Comidas comi70= new Comidas(421, "Cena","Sopa de tortilla",237,false);
        Comidas comi71= new Comidas(422, "Cena","Milanesa de pollo c/ensalada verduras",246,false);
        Comidas comi72= new Comidas(423, "Cena","Sopa de pollo",246,false);
        Comidas comi73= new Comidas(425, "Cena","Caldo de pollo con verduras",250,false);
        Comidas comi74= new Comidas(426, "Cena","Empanada de pescado",256,false);
        Comidas comi75= new Comidas(428, "Cena","Empanada de carne al horno",293,false);
        Comidas comi76= new Comidas(429, "Cena","Carne con tomate",298,false);
        Comidas comi77= new Comidas(430, "Cena","Caldo de carne",323,false);
        Comidas comi78= new Comidas(431, "Cena","Empanada de carne c/ensalada lechuga",342,false);
        Comidas comi79= new Comidas(432, "Cena","Sopa de pollo con fideos",349,false);
        Comidas comi80= new Comidas(433, "Cena","Omelette c/ensalada tomate y cebolla",457,false);
        Comidas comi81= new Comidas(509, "Colacion","Vaso de Leche de almendras",22,false);
        Comidas comi82= new Comidas(512, "Colacion","Vaso de Leche de soja",36,false);
        Comidas comi83= new Comidas(513, "Colacion","Vaso de Leche con avena",40,false);
        Comidas comi84= new Comidas(514, "Colacion","1 Mandarina",53,false);
        Comidas comi85= new Comidas(515, "Colacion","100 grs Melón verde",56,false);
        Comidas comi86= new Comidas(516, "Colacion","1 Pera",57,false);
        Comidas comi87= new Comidas(517, "Colacion","2 Kiwi verde",61,false);
        Comidas comi88= new Comidas(518, "Colacion","1 Manzana",64,false);
        Comidas comi89= new Comidas(519, "Colacion","1 Banana mediana",92,false);
        Comidas comi90= new Comidas(520, "Colacion","150 ml Ensalada de frutas",97,false);
        Comidas comi91= new Comidas(501, "Colacion","Vaso de Chocolate caliente",132,false);
        Comidas comi92= new Comidas(502, "Colacion","200 grs Sandía",138,false);
        Comidas comi93= new Comidas(503, "Colacion","Vaso de Leche light c/50 gr pasas uvas",141,false);
        Comidas comi94= new Comidas(504, "Colacion","1 Durazno",144,false);
        Comidas comi95= new Comidas(505, "Colacion","200 grs Uvas",144,false);
        Comidas comi96= new Comidas(506, "Colacion","1 Naranja",147,false);
        Comidas comi97= new Comidas(507, "Colacion","1 Pomelo",147,false);
        Comidas comi98= new Comidas(508, "Colacion","1 Manzana verde",151,false);
        Comidas comi99= new Comidas(510, "Colacion","1 Banana frita",252,false);
        Comidas comi100= new Comidas(511, "Colacion","2 o 3 Higos, secos",270,false);
        Comidas comi101= new Comidas(601, "Desayuno","Caldo de verduras",148,false);
        Comidas comi102= new Comidas(602, "Desayuno","2 Huevos revueltos",155,false);
        Comidas comi103= new Comidas(603, "Desayuno","Café con azúcar c/disco arroz",210,false);
        Comidas comi104= new Comidas(604, "Desayuno","2 Huevos revueltos c/tostada",215,false);
        Comidas comi105= new Comidas(605, "Desayuno","Cafe con leche c/pan tostado integral",240,false);
        Comidas comi106= new Comidas(606, "Desayuno","Te Verde c/pan integral c/semillas",242,false);
        Comidas comi107= new Comidas(607, "Desayuno","Café c/leche desc c/pan semillas",250,false);
        Comidas comi108= new Comidas(608, "Desayuno","Sandwich de jamón tostado",255,false);
        Comidas comi109= new Comidas(609, "Desayuno","Capuchino c/pan y queso",271,false);
        Comidas comi110= new Comidas(610, "Desayuno","Café descafeinado c/pan tostado",299,false);
        Comidas comi111= new Comidas(611, "Desayuno","Te Rojo c/pan blanco tostado",301,false);
        Comidas comi112= new Comidas(612, "Desayuno","Té negro c/tostada mermelada",324,false);
        Comidas comi113= new Comidas(613, "Desayuno","Yerba mate c/tostada light",325,false);
        Comidas comi114= new Comidas(614, "Desayuno","Mate amargo c/tostada mermelada",330,false);
        Comidas comi115= new Comidas(615, "Desayuno","2 Huevos revueltos c/discos arroz",355,false);
        Comidas comi116= new Comidas(616, "Desayuno","Tortitas de arroz integral",383,false);
        Comidas comi117= new Comidas(617, "Desayuno","Omelette",387,false);
        Comidas comi118= new Comidas(618, "Desayuno","Té negro con leche c/factura",391,false);
        Comidas comi119= new Comidas(619, "Desayuno","Mate cocido c/pan tostado integral",392,false);
        Comidas comi120= new Comidas(620, "Desayuno","Omelette c/discos arroz",397,false);
        Comidas comi121= new Comidas(621, "Desayuno","Omelette c/tostada light",407,false);
        Comidas comi122= new Comidas(622, "Desayuno","Te con leche c/medialuna manteca",415,false);
        Comidas comi123= new Comidas(701, "Merienda","Caldo de verduras",148,false);
        Comidas comi124= new Comidas(702, "Merienda","2 Huevos revueltos",155,false);
        Comidas comi125= new Comidas(703, "Merienda","Café con azúcar c/disco arroz",210,false);
        Comidas comi126= new Comidas(704, "Merienda","2 Huevos revueltos c/tostada",215,false);
        Comidas comi127= new Comidas(705, "Merienda","Cafe con leche c/pan tostado integral",240,false);
        Comidas comi128= new Comidas(706, "Merienda","Te Verde c/pan integral c/semillas",242,false);
        Comidas comi129= new Comidas(707, "Merienda","Café c/leche desc c/pan semillas",250,false);
        Comidas comi130= new Comidas(708, "Merienda","Sandwich de jamón tostado",255,false);
        Comidas comi131= new Comidas(709, "Merienda","Capuchino c/pan y queso",271,false);
        Comidas comi132= new Comidas(710, "Merienda","Café descafeinado c/pan tostado",299,false);
        Comidas comi133= new Comidas(711, "Merienda","Te Rojo c/pan blanco tostado",301,false);
        Comidas comi134= new Comidas(712, "Merienda","Té negro c/tostada mermelada",324,false);
        Comidas comi135= new Comidas(713, "Merienda","Yerba mate c/tostada light",325,false);
        Comidas comi136= new Comidas(714, "Merienda","Mate amargo c/tostada mermelada",330,false);
        Comidas comi137= new Comidas(715, "Merienda","2 Huevos revueltos c/discos arroz",355,false);
        Comidas comi138= new Comidas(716, "Merienda","Tortitas de arroz integral",383,false);
        Comidas comi139= new Comidas(717, "Merienda","Omelette",387,false);
        Comidas comi140= new Comidas(718, "Merienda","Té negro con leche c/factura",391,false);
        Comidas comi141= new Comidas(719, "Merienda","Mate cocido c/pan tostado integral",392,false);
        Comidas comi142= new Comidas(720, "Merienda","Omelette c/discos arroz",397,false);
        Comidas comi143= new Comidas(721, "Merienda","Omelette c/tostada light",407,false);
        Comidas comi144= new Comidas(722, "Merienda","Te con leche c/medialuna manteca",415,false);
        com.cargarComidas(comi1);
        com.cargarComidas(comi2);
        com.cargarComidas(comi3);
        com.cargarComidas(comi4);
        com.cargarComidas(comi5);
        com.cargarComidas(comi6);
        com.cargarComidas(comi7);
        com.cargarComidas(comi8);
        com.cargarComidas(comi9);
        com.cargarComidas(comi10);
        com.cargarComidas(comi11);
        com.cargarComidas(comi12);
        com.cargarComidas(comi13);
        com.cargarComidas(comi14);
        com.cargarComidas(comi15);
        com.cargarComidas(comi16);
        com.cargarComidas(comi17);
        com.cargarComidas(comi18);
        com.cargarComidas(comi19);
        com.cargarComidas(comi20);
        com.cargarComidas(comi21);
        com.cargarComidas(comi22);
        com.cargarComidas(comi23);
        com.cargarComidas(comi24);
        com.cargarComidas(comi25);
        com.cargarComidas(comi26);
        com.cargarComidas(comi27);
        com.cargarComidas(comi28);
        com.cargarComidas(comi29);
        com.cargarComidas(comi30);
        com.cargarComidas(comi31);
        com.cargarComidas(comi32);
        com.cargarComidas(comi33);
        com.cargarComidas(comi34);
        com.cargarComidas(comi35);
        com.cargarComidas(comi36);
        com.cargarComidas(comi37);
        com.cargarComidas(comi38);
        com.cargarComidas(comi39);
        com.cargarComidas(comi40);
        com.cargarComidas(comi41);
        com.cargarComidas(comi42);
        com.cargarComidas(comi43);
        com.cargarComidas(comi44);
        com.cargarComidas(comi45);
        com.cargarComidas(comi46);
        com.cargarComidas(comi47);
        com.cargarComidas(comi48);
        com.cargarComidas(comi49);
        com.cargarComidas(comi50);
        com.cargarComidas(comi51);
        com.cargarComidas(comi52);
        com.cargarComidas(comi53);
        com.cargarComidas(comi54);
        com.cargarComidas(comi55);
        com.cargarComidas(comi56);
        com.cargarComidas(comi57);
        com.cargarComidas(comi58);
        com.cargarComidas(comi59);
        com.cargarComidas(comi60);
        com.cargarComidas(comi61);
        com.cargarComidas(comi62);
        com.cargarComidas(comi63);
        com.cargarComidas(comi64);
        com.cargarComidas(comi65);
        com.cargarComidas(comi66);
        com.cargarComidas(comi67);
        com.cargarComidas(comi68);
        com.cargarComidas(comi69);
        com.cargarComidas(comi70);
        com.cargarComidas(comi71);
        com.cargarComidas(comi72);
        com.cargarComidas(comi73);
        com.cargarComidas(comi74);
        com.cargarComidas(comi75);
        com.cargarComidas(comi76);
        com.cargarComidas(comi77);
        com.cargarComidas(comi78);
        com.cargarComidas(comi79);
        com.cargarComidas(comi80);
        com.cargarComidas(comi81);
        com.cargarComidas(comi82);
        com.cargarComidas(comi83);
        com.cargarComidas(comi84);
        com.cargarComidas(comi85);
        com.cargarComidas(comi86);
        com.cargarComidas(comi87);
        com.cargarComidas(comi88);
        com.cargarComidas(comi89);
        com.cargarComidas(comi90);
        com.cargarComidas(comi91);
        com.cargarComidas(comi92);
        com.cargarComidas(comi93);
        com.cargarComidas(comi94);
        com.cargarComidas(comi95);
        com.cargarComidas(comi96);
        com.cargarComidas(comi97);
        com.cargarComidas(comi98);
        com.cargarComidas(comi99);
        com.cargarComidas(comi100);
        com.cargarComidas(comi101);
        com.cargarComidas(comi102);
        com.cargarComidas(comi103);
        com.cargarComidas(comi104);
        com.cargarComidas(comi105);
        com.cargarComidas(comi106);
        com.cargarComidas(comi107);
        com.cargarComidas(comi108);
        com.cargarComidas(comi109);
        com.cargarComidas(comi110);
        com.cargarComidas(comi111);
        com.cargarComidas(comi112);
        com.cargarComidas(comi113);
        com.cargarComidas(comi114);
        com.cargarComidas(comi115);
        com.cargarComidas(comi116);
        com.cargarComidas(comi117);
        com.cargarComidas(comi118);
        com.cargarComidas(comi119);
        com.cargarComidas(comi120);
        com.cargarComidas(comi121);
        com.cargarComidas(comi122);
        com.cargarComidas(comi123);
        com.cargarComidas(comi124);
        com.cargarComidas(comi125);
        com.cargarComidas(comi126);
        com.cargarComidas(comi127);
        com.cargarComidas(comi128);
        com.cargarComidas(comi129);
        com.cargarComidas(comi130);
        com.cargarComidas(comi131);
        com.cargarComidas(comi132);
        com.cargarComidas(comi133);
        com.cargarComidas(comi134);
        com.cargarComidas(comi135);
        com.cargarComidas(comi136);
        com.cargarComidas(comi137);
        com.cargarComidas(comi138);
        com.cargarComidas(comi139);
        com.cargarComidas(comi140);
        com.cargarComidas(comi141);
        com.cargarComidas(comi142);
        com.cargarComidas(comi143);
        com.cargarComidas(comi144);
        
        //GUARDAR COMIDAS

        com.cargarDietasPosibles(id1, id1, id1, id1, id1, id1, id1, true);



        




    }
    

    
    
    
}