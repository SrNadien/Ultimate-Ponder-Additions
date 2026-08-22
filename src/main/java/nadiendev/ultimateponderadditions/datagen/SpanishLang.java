package nadiendev.ultimateponderadditions.datagen;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

public final class SpanishLang {
    public static final Map<String, String> ENTRIES = build();

    private SpanishLang() {
    }

    private static Map<String, String> build() {
        Map<String, String> m = new LinkedHashMap<>();
        String p = "ultimateponderadditions.ponder.";

        m.put("itemGroup.ultimateponderadditions", "Ultimate Ponder Additions");
        m.put("item.ultimateponderadditions.guide", "Guía de Ultimate Ponder Additions");
        m.put("item.ultimateponderadditions.guide.tooltip",
                "Máquinas, cajones, gallinas y redes, explicados.");

        m.put(p + "tag.industrial_foregoing", "Industrial Foregoing");
        m.put(p + "tag.industrial_foregoing.description",
                "Máquinas que cultivan, minan y generan por ti.");
        m.put(p + "tag.functional_storage", "Functional Storage");
        m.put(p + "tag.functional_storage.description",
                "Cajones, controladores y los armarios que guardan lo que los cajones no quieren.");
        m.put(p + "tag.modern_chickens", "Modern Chickens");
        m.put(p + "tag.modern_chickens.description",
                "Ponederos, criadoras y aves que ponen desde hierro hasta lava.");
        m.put(p + "tag.applied_energistics", "Applied Energistics 2");
        m.put(p + "tag.applied_energistics.description",
                "Redes, canales, celdas de almacenamiento y las máquinas que las alimentan.");

        m.put(p + "if_plant_farm.header", "Automatizar una granja");
        m.put(p + "if_plant_farm.text_1",
                "El Sembrador y el Recolector de Plantas trabajan un área de 3x3 delante de ellos.");
        m.put(p + "if_plant_farm.text_2",
                "El Sembrador planta las semillas que le dejes en el inventario.");
        m.put(p + "if_plant_farm.text_3",
                "Solo siembra en tierra labrada, así que ara la parcela antes de encenderlo.");
        m.put(p + "if_plant_farm.text_4",
                "El Recolector cosecha esa misma área y saca los cultivos por su parte de atrás.");
        m.put(p + "if_plant_farm.text_5",
                "Un Fertilizador de Plantas al lado de la parcela acelera los cultivos.");
        m.put(p + "if_plant_farm.text_6",
                "Todas estas máquinas van con Forge Energy: sin energía no hay cosecha.");
        m.put(p + "if_plant_farm.text_7",
                "Ponle una Mejora de Alcance a cada máquina para que el área trabajada pase de 3x3.");

        m.put(p + "if_mob_farm.header", "Granjas de mobs");
        m.put(p + "if_mob_farm.text_1",
                "El Duplicador de Mobs genera copias de un mob capturado con una Herramienta de Encarcelamiento.");
        m.put(p + "if_mob_farm.text_2",
                "Llénalo de Esencia y deja la herramienta de encarcelamiento en su inventario.");
        m.put(p + "if_mob_farm.text_3",
                "El Triturador de Mobs mata todo lo que tenga a tiro y lo convierte en Esencia y drops.");
        m.put(p + "if_mob_farm.text_4",
                "Apunta los drops a cualquier inventario para que no desaparezca nada.");
        m.put(p + "if_mob_farm.text_5",
                "Triturar mobs da más Esencia de la que cuesta duplicarlos, así que el ciclo se paga solo.");
        m.put(p + "if_mob_farm.text_6",
                "La Fábrica de Matadero es la otra opción: sin drops ni experiencia, pero con Carne Líquida y Limo Rosa.");
        m.put(p + "if_mob_farm.text_7",
                "Ambos aceptan Mejoras de Alcance; una Mejora de Fortuna en el Triturador mejora los drops.");

        m.put(p + "if_laser_drill.header", "Minar sin mina");
        m.put(p + "if_laser_drill.text_1",
                "La Base de Láser de Mineral saca minerales de la nada, alimentada por los Taladros Láser que la rodean.");
        m.put(p + "if_laser_drill.text_2",
                "La base va en el centro. Qué minerales puede producir depende de la dimensión en la que esté.");
        m.put(p + "if_laser_drill.text_3",
                "Cada Taladro Láser apuntando a la base la acelera. Hasta doce pueden alimentar una sola base.");
        m.put(p + "if_laser_drill.text_4",
                "Mete una Lente Láser en un taladro para inclinar la producción hacia minerales de ese color.");
        m.put(p + "if_laser_drill.text_5",
                "El mineral terminado sale de la base: llévalo con tuberías al inventario que quieras.");
        m.put(p + "if_laser_drill.text_6",
                "Los taladros son la parte que consume; la base en sí no necesita casi nada.");
        m.put(p + "if_laser_drill.text_7",
                "Una Base de Láser de Fluidos hace el mismo truco con fluidos en vez de minerales.");

        m.put(p + "if_power.header", "Dar energía a la fábrica");
        m.put(p + "if_power.text_1",
                "Todas estas máquinas queman Forge Energy, así que lo primero que hay que montar es una fuente.");
        m.put(p + "if_power.text_2",
                "El Generador Lamentable quema combustible sólido. Es exactamente tan bueno como suena, pero te saca del apuro.");
        m.put(p + "if_power.text_3",
                "El Biorreactor coge materia vegetal (semillas, brotes, cultivos) y la convierte en Biocombustible.");
        m.put(p + "if_power.text_4",
                "Quiere variedad: cuantos más tipos distintos de planta tenga dentro, más Biocombustible por tanda.");
        m.put(p + "if_power.text_5",
                "El Generador de Biocombustible quema ese Biocombustible, y juega en otra liga.");
        m.put(p + "if_power.text_6",
                "La Unidad de Procesado de Látex saca Látex de los árboles, que se convierte en Caucho Seco y luego en Plástico.");
        m.put(p + "if_power.text_7",
                "La Refinería de Lodos convierte el Lodo que sueltan las máquinas de vuelta en minerales y bloques.");
        m.put(p + "if_power.text_8",
                "Alimenta el Biorreactor desde un Recolector de Plantas y la fábrica entera funciona con su propia granja.");

        m.put(p + "if_conveyor.header", "Mover objetos de un sitio a otro");
        m.put(p + "if_conveyor.text_1",
                "Las cintas transportan los objetos tirados en el suelo hacia donde miran.");
        m.put(p + "if_conveyor.text_2",
                "Clic derecho con una llave inglesa para girar una cinta; clic en el borde para poner una rampa.");
        m.put(p + "if_conveyor.text_3",
                "Mete una cinta en cualquier inventario y los objetos se insertan solos.");
        m.put(p + "if_conveyor.text_4",
                "El Colocador de Bloques pone bloques de su inventario justo delante.");
        m.put(p + "if_conveyor.text_5",
                "El Rompedor de Bloques hace lo contrario, y suelta lo que pica.");
        m.put(p + "if_conveyor.text_6",
                "Las mejoras de cinta añaden extracción, inserción, reparto y detección.");

        m.put(p + "fs_drawers.header", "Cajones");
        m.put(p + "fs_drawers.text_1",
                "Un cajón guarda un solo tipo de objeto por ranura, y mucha más cantidad de la que cabría en un cofre.");
        m.put(p + "fs_drawers.text_2",
                "Una ranura: el bloque entero es una única pila muy profunda.");
        m.put(p + "fs_drawers.text_3",
                "Los cajones de dos y cuatro ranuras cambian capacidad por variedad.");
        m.put(p + "fs_drawers.text_4",
                "Clic derecho en una ranura para meter una pila, o mantén el clic para vaciar tu inventario dentro.");
        m.put(p + "fs_drawers.text_5",
                "Clic izquierdo para sacar una pila; agachado, para sacar un solo objeto.");
        m.put(p + "fs_drawers.text_6",
                "Las mejoras van en la interfaz del cajón: de Cobre a Netherita suben la capacidad, y Vacío tira lo que sobra.");
        m.put(p + "fs_drawers.text_7",
                "La Herramienta de Configuración bloquea un cajón a su objeto actual, así lo reserva aunque se vacíe.");

        m.put(p + "fs_controller.header", "El Controlador de Almacenamiento");
        m.put(p + "fs_controller.text_1",
                "Una pared de cajones solo sirve si puedes buscar en ella. Para eso está el controlador.");
        m.put(p + "fs_controller.text_2",
                "El Controlador de Almacenamiento se queda con todos los cajones conectados y los enseña como un único inventario.");
        m.put(p + "fs_controller.text_3",
                "Los cajones se conectan por las caras que se tocan: la pared tiene que ser una pieza maciza.");
        m.put(p + "fs_controller.text_4",
                "Las Extensiones de Controlador llevan la conexión más lejos sin aportar almacenamiento propio.");
        m.put(p + "fs_controller.text_5",
                "Tuberías, tolvas y buses de almacenamiento de AE2 pueden hablar con el controlador en vez de con cada cajón.");
        m.put(p + "fs_controller.text_6",
                "¿Fuera de alcance? La Herramienta de Enlace ata un cajón lejano al controlador a mano.");

        m.put(p + "fs_compacting_drawer.header", "Cajones Compactadores");
        m.put(p + "fs_compacting_drawer.text_1",
                "Un Cajón Compactador guarda un material en todos sus niveles de crafteo a la vez.");
        m.put(p + "fs_compacting_drawer.text_2",
                "Mete pepitas, lingotes o bloques de hierro: el cajón convierte entre ellos automáticamente.");
        m.put(p + "fs_compacting_drawer.text_3",
                "Saca de la ranura que te haga falta. Nueve pepitas siempre vuelven a salir como un lingote.");
        m.put(p + "fs_compacting_drawer.text_4",
                "El Cajón Compactador Simple hace lo mismo con un material de solo dos pasos.");
        m.put(p + "fs_compacting_drawer.text_5",
                "Es la forma más barata de que pepitas, lingotes y bloques dejen de comerse tres ranuras.");

        m.put(p + "fs_ender_drawer.header", "Cajones del End");
        m.put(p + "fs_ender_drawer.text_1",
                "Dos Cajones del End con la misma frecuencia son el mismo cajón, por lejos que estén.");
        m.put(p + "fs_ender_drawer.text_2", "Mete algo aquí...");
        m.put(p + "fs_ender_drawer.text_3", "...y sácalo allí.");
        m.put(p + "fs_ender_drawer.text_4",
                "La frecuencia es un código de colores que se pone en la interfaz del cajón. Otro código, otro almacén.");
        m.put(p + "fs_ender_drawer.text_5",
                "Muy cómodo para ir a minar: un cajón en la mina y otro en la base.");

        m.put(p + "fs_armory_cabinet.header", "El Armario de Armería");
        m.put(p + "fs_armory_cabinet.text_1",
                "Los cajones rechazan cualquier cosa con NBT, lo que deja fuera herramientas, armaduras y libros encantados.");
        m.put(p + "fs_armory_cabinet.text_2",
                "El Armario de Armería es la respuesta: cientos de ranuras, encantadas de guardar equipo.");
        m.put(p + "fs_armory_cabinet.text_3",
                "Un armario sustituye a una fila larguísima de cofres.");
        m.put(p + "fs_armory_cabinet.text_4",
                "Es un inventario normal y corriente, así que tolvas y tuberías pueden llenarlo y vaciarlo como siempre.");

        m.put(p + "chickens_roost.header", "El Ponedero");
        m.put(p + "chickens_roost.text_1",
                "Un Ponedero guarda gallinas como objeto y va soltando su producción en sus propias ranuras de salida. Sin bichos sueltos.");
        m.put(p + "chickens_roost.text_2",
                "Gallinas dentro, recursos fuera: hierro, redstone, piedra luminosa, lo que produzca ese tipo.");
        m.put(p + "chickens_roost.text_3",
                "Las mejoras de Velocidad y de Pila dentro del ponedero suben el ritmo y la cantidad.");
        m.put(p + "chickens_roost.text_4",
                "Un Recolector saca la producción terminada de todos los ponederos a su alcance y la guarda en su inventario.");
        m.put(p + "chickens_roost.text_5",
                "El Ponedero Mecánico va con RF y tiene cuatro filas de gallinas independientes, cada una con su salida.");
        m.put(p + "chickens_roost.text_6",
                "Un Nido cerca proyecta un aura que acelera todos los ponederos que alcanza.");

        m.put(p + "chickens_breeder.header", "Criar gallinas");
        m.put(p + "chickens_breeder.text_1",
                "La Criadora coge dos gallinas como objeto y semillas, y produce descendencia.");
        m.put(p + "chickens_breeder.text_2",
                "Los dos padres tienen que ser gallinas normales. Los gallos no van aquí.");
        m.put(p + "chickens_breeder.text_3",
                "Qué gallina sale lo decide el árbol de cría: una de Hierro y una de Pedernal dan una de Oro.");
        m.put(p + "chickens_breeder.text_4",
                "El Nido es otra máquina distinta. Lleva un gallo y semillas, y no produce ningún objeto.");
        m.put(p + "chickens_breeder.text_5",
                "Lo que hace es un aura: mientras quema semillas, todos los ponederos a su alcance van más rápido.");
        m.put(p + "chickens_breeder.text_6",
                "El Nido Mecánico hace lo mismo con un Gallo Robot y RF en vez de semillas.");
        m.put(p + "chickens_breeder.text_7",
                "Usa un Analizador sobre una gallina para leer sus estadísticas antes de decidir el cruce.");

        m.put(p + "chickens_henhouse.header", "El Gallinero");
        m.put(p + "chickens_henhouse.text_1",
                "Las gallinas que sueltan recursos por el suelo necesitan algo que los recoja. Eso es el Gallinero.");
        m.put(p + "chickens_henhouse.text_2",
                "Recoge lo que sueltan las gallinas cercanas en un inventario de 3x3 dentro de él.");
        m.put(p + "chickens_henhouse.text_3",
                "Funciona con FE, o con balas de heno como combustible. Quemar heno deja tierra de subproducto.");
        m.put(p + "chickens_henhouse.text_4",
                "Hay un Gallinero por cada tipo de madera, para que pegue con el corral que hayas construido.");
        m.put(p + "chickens_henhouse.text_5",
                "Barato y de principio. Un Ponedero con Recolector es más limpio cuando puedas permitírtelo.");

        m.put(p + "chickens_incubator.header", "La Incubadora");
        m.put(p + "chickens_incubator.text_1",
                "La Incubadora convierte los huevos de invocación de Modern Chickens en las gallinas como objeto que aceptan las máquinas.");
        m.put(p + "chickens_incubator.text_2",
                "Mete los huevos y dale energía. Cada conversión tarda 200 ticks.");
        m.put(p + "chickens_incubator.text_3",
                "Va con RF, no con calor. Ni lava ni fuego.");
        m.put(p + "chickens_incubator.text_4",
                "Las gallinas como objeto son lo que aceptan Ponederos, Criadoras y Nidos, así que todo empieza aquí.");
        m.put(p + "chickens_incubator.text_5",
                "Un huevo salido de una Máquina de Rociado Avian entra aquí directo para convertirse en la gallina.");

        m.put(p + "chickens_roost_generator.header", "Energía a partir de gallinas");
        m.put(p + "chickens_roost_generator.text_1",
                "Las gallinas ponen algo más que recursos sólidos. Las máquinas Avian convierten el resto en algo aprovechable.");
        m.put(p + "chickens_roost_generator.text_2",
                "El Convertidor de Flujo Avian vacía Huevos de Flujo en un búfer de FE y lo empuja a las máquinas de al lado.");
        m.put(p + "chickens_roost_generator.text_3",
                "El Convertidor de Fluidos Avian rompe Huevos Líquidos en un tanque y alimenta tanques o tuberías adyacentes.");
        m.put(p + "chickens_roost_generator.text_4",
                "El Convertidor Químico Avian hace lo mismo con Huevos Químicos y de Gas, hacia un búfer de Mekanism.");
        m.put(p + "chickens_roost_generator.text_5",
                "La Máquina de Rociado Avian gasta RF y un reactivo para crear huevos de invocación especiales.");
        m.put(p + "chickens_roost_generator.text_6",
                "El Generador de Ponedero es la vía directa: Gallinas de Flujo de Redstone dentro, FE/t fuera.");
        m.put(p + "chickens_roost_generator.text_7",
                "Una pared de ponederos alimentando convertidores es una central eléctrica seria a media partida.");

        m.put(p + "ae2_inscriber.header", "El Inscriptor");
        m.put(p + "ae2_inscriber.text_1",
                "Toda máquina de AE2 se construye con procesadores, y los procesadores salen de los Inscriptores.");
        m.put(p + "ae2_inscriber.text_2",
                "El molde va en la ranura de arriba, el material en la de en medio, y sale un circuito impreso.");
        m.put(p + "ae2_inscriber.text_3",
                "Los moldes no se gastan. Búscalos en meteoritos, o muele Piedra Celeste hasta que aparezca uno.");
        m.put(p + "ae2_inscriber.text_4",
                "Encadena tres inscriptores y el último ensambla las piezas impresas en un procesador.");
        m.put(p + "ae2_inscriber.text_5",
                "El Aceptador de Energía ME convierte Forge Energy en AE, que es lo que bebe el inscriptor.");
        m.put(p + "ae2_inscriber.text_6",
                "Una Celda de Energía amortigua esa energía para que un pico de crafteo no atasque la red.");
        m.put(p + "ae2_inscriber.text_7",
                "Cuando la red tenga patrones para los moldes, un Proveedor de Patrones puede llevar toda la fila.");

        m.put(p + "ae2_growth_accelerator.header", "Cultivar Cuarzo Certus");
        m.put(p + "ae2_growth_accelerator.text_1",
                "El Cuarzo Certus en Gemación hace brotar cristales en sus caras, igual que la amatista.");
        m.put(p + "ae2_growth_accelerator.text_2",
                "El bloque baja un nivel cada vez que madura un brote: Impecable, Astillado, Dañado y luego cuarzo normal.");
        m.put(p + "ae2_growth_accelerator.text_3",
                "Rompe un racimo con lo que sea y suelta cristales; rómpelo con Toque de Seda para moverlo entero.");
        m.put(p + "ae2_growth_accelerator.text_4",
                "Los Aceleradores de Crecimiento pegados al bloque aceleran el proceso una barbaridad.");
        m.put(p + "ae2_growth_accelerator.text_5",
                "Los aceleradores necesitan energía AE, y solo cuentan si tocan el bloque en gemación.");
        m.put(p + "ae2_growth_accelerator.text_6",
                "Añade un Generador de Resonancia de Cristal y un montaje de Spatial IO y el cuarzo deja de ser un cuello de botella.");

        m.put(p + "ae2_network.header", "Tu primera red ME");
        m.put(p + "ae2_network.text_1",
                "Una red ME es energía, almacenamiento y cable uniéndolos. Todo lo demás es un extra.");
        m.put(p + "ae2_network.text_2",
                "La energía entra por un Aceptador de Energía ME, que convierte FE en AE.");
        m.put(p + "ae2_network.text_3",
                "El Controlador ME reparte canales. Las redes pequeñas pueden prescindir de él.");
        m.put(p + "ae2_network.text_4",
                "La Unidad ME guarda las celdas de almacenamiento. Cada celda es el disco duro de la red.");
        m.put(p + "ae2_network.text_5",
                "Cada aparato que guarde o mueva objetos gasta un canal. Un cable normal lleva ocho.");
        m.put(p + "ae2_network.text_6",
                "Terminales, buses y túneles P2P se acoplan al cable como piezas.");
        m.put(p + "ae2_network.text_7",
                "Si te quedas sin canales los aparatos se apagan. El cable denso lleva treinta y dos en vez de ocho.");

        m.put(p + "ae2_crafting_cpu.header", "Fabricación automática");
        m.put(p + "ae2_crafting_cpu.text_1",
                "Una CPU de Fabricación es cualquier cubo macizo de bloques de crafteo conectado a la red.");
        m.put(p + "ae2_crafting_cpu.text_2",
                "El Almacenamiento de Fabricación decide cómo de grande puede ser el trabajo. Sin almacenamiento no hay crafteo.");
        m.put(p + "ae2_crafting_cpu.text_3",
                "Las Unidades de Coprocesamiento dejan que la CPU empuje varios ingredientes a la vez.");
        m.put(p + "ae2_crafting_cpu.text_4",
                "El Monitor de Fabricación muestra en qué está trabajando la CPU.");
        m.put(p + "ae2_crafting_cpu.text_5",
                "Los Proveedores de Patrones guardan las recetas y empujan los ingredientes a la máquina que tienen detrás.");
        m.put(p + "ae2_crafting_cpu.text_6",
                "Un Ensamblador Molecular pegado a un proveedor se encarga de las recetas normales de mesa de trabajo.");
        m.put(p + "ae2_crafting_cpu.text_7",
                "Monta varias CPU pequeñas en vez de una enorme, así los trabajos van en paralelo.");
        m.put(p + "ae2_crafting_cpu.text_8",
                "Cada CPU hace un trabajo cada vez: el número de CPU es el número de crafteos simultáneos.");

        m.put(p + "ae2_charger.header", "El Cargador");
        m.put(p + "ae2_charger.text_1",
                "El Cargador convierte Cuarzo Certus en Cuarzo Certus Cargado, que es de donde sale el Fluix.");
        m.put(p + "ae2_charger.text_2",
                "Deja un cristal en la parte frontal y espera. También recarga herramientas y celdas de energía.");
        m.put(p + "ae2_charger.text_3",
                "¿Todavía sin energía? Coloca una Manivela encima y dale vueltas a mano.");
        m.put(p + "ae2_charger.text_4",
                "La Cámara de Vibración quema combustible para dar AE directamente: tosco, pero sirve el primer día.");
        m.put(p + "ae2_charger.text_5",
                "Cuando tengas un generador de verdad, el Aceptador de Energía toma el relevo.");
        m.put(p + "ae2_charger.text_6",
                "Certus Cargado más Cuarzo del Nether más Redstone, tirados al agua, te dan Fluix.");


        m.put(p + "tag.custom", "Custom");
        m.put(p + "tag.custom.description",
                "Montajes hechos a mano: patrones de multibloque y disposiciones de máquinas que merece la pena copiar.");

        m.put(p + "pack_ae2_controller.header", "Un Controlador AE2 bien puesto");
        m.put(p + "pack_ae2_controller.text_1",
                "El Controlador ME, colocado de forma que todas sus caras queden accesibles.");

        m.put(p + "pack_ae2_crafting_cube.header", "El cubo de crafteo");
        m.put(p + "pack_ae2_crafting_cube.text_1",
                "El cerebro de la red: almacenamiento, aceleradores y un monitor en un solo bloque.");

        m.put(p + "pack_ae2_assembler.header", "Banco de ensambladores moleculares");
        m.put(p + "pack_ae2_assembler.text_1",
                "Proveedores de Patrones alimentando un banco de Ensambladores Moleculares.");

        m.put(p + "pack_ars_recipes.header", "Recetas de Ars Nouveau");
        m.put(p + "pack_ars_recipes.text_1",
                "Ars Nouveau tiene recetas mágicas que se hacen con catalizadores.");
        m.put(p + "pack_ars_recipes.text_2",
                "El Aparato de Encantamiento necesita un núcleo debajo; la Cámara de Imbuición no.");
        m.put(p + "pack_ars_recipes.text_3",
                "Pon los ingredientes en pedestales a un bloque del catalizador.");
        m.put(p + "pack_ars_recipes.text_4", "El ingrediente central va en el propio catalizador.");
        m.put(p + "pack_ars_recipes.text_5",
                "La receta arranca sola, pero puede pedir fuente (source) cerca.");
        m.put(p + "pack_ars_recipes.text_6",
                "El Aparato de Encantamiento consume lo que hay en los pedestales; la Cámara de Imbuición no.");

        m.put(p + "pack_andesite_casing.header", "Revestimiento de Andesita automático");
        m.put(p + "pack_andesite_casing.text_1",
                "Revestimiento de Andesita a demanda, y se lleva bien con una red ME.");

        m.put(p + "pack_create_lumber.header", "Madera automática");
        m.put(p + "pack_create_lumber.text_1",
                "Una granja de árboles que mantiene el suministro de troncos por su cuenta.");

        m.put(p + "pack_laser_drill.header", "Taladro láser, bien montado");
        m.put(p + "pack_laser_drill.text_1",
                "Doce taladros alrededor de una base, y energía para mantenerlos a todos.");

        m.put(p + "pack_stasis_chamber.header", "La Cámara de Estasis");
        m.put(p + "pack_stasis_chamber.text_1",
                "La Cámara de Estasis, conectada y lista para funcionar.");

        m.put(p + "pack_harvester_pylon.header", "Usar el Harvester Pylon");
        m.put(p + "pack_harvester_pylon.text_1",
                "El Harvester Pylon se coloca en el bloque de agua de la granja.");
        m.put(p + "pack_harvester_pylon.text_2", "Necesita una azada en su inventario para funcionar.");
        m.put(p + "pack_harvester_pylon.text_3", "La durabilidad de la azada se gasta al cosechar.");
        m.put(p + "pack_harvester_pylon.text_4",
                "También necesita almacenamiento encima donde dejar lo cosechado.");
        m.put(p + "pack_harvester_pylon.text_5", "Su área de trabajo se puede poner en 3x3, 5x5, 7x7 o 9x9.");
        m.put(p + "pack_harvester_pylon.text_6", "3x3");
        m.put(p + "pack_harvester_pylon.text_7", "5x5");
        m.put(p + "pack_harvester_pylon.text_8", "7x7");
        m.put(p + "pack_harvester_pylon.text_9", "9x9");

        m.put(p + "pack_fission_reactor.header", "Reactor de Fisión de Mekanism");
        m.put(p + "pack_fission_reactor.text_1", "Las aristas tienen que ser carcasas.");
        m.put(p + "pack_fission_reactor.text_2",
                "Las paredes pueden ser carcasas o cristal de reactor.");
        m.put(p + "pack_fission_reactor.text_3",
                "Mete bloques de ensamblaje de combustible dentro para formar las barras.");
        m.put(p + "pack_fission_reactor.text_4",
                "Pon un ensamblaje de barra de control encima de cada barra de combustible.");

        m.put(p + "pack_fission_fuel_rods.header", "Reactor de Fisión: ensamblajes de combustible");
        m.put(p + "pack_fission_fuel_rods.text_1",
                "Mete bloques de ensamblaje de combustible dentro para formar las barras.");
        m.put(p + "pack_fission_fuel_rods.text_2",
                "Una barra son varios ensamblajes de combustible con uno de barra de control encima.");
        m.put(p + "pack_fission_fuel_rods.text_3",
                "Los ensamblajes de barra de control van a un bloque del techo.");
        m.put(p + "pack_fission_fuel_rods.text_4", "Las barras de combustible no pueden tocarse entre sí.");
        m.put(p + "pack_fission_fuel_rods.text_5",
                "Varias barras funcionan mejor colocadas en damero.");

        m.put(p + "pack_fission_logic.header", "Reactor de Fisión: adaptadores lógicos");
        m.put(p + "pack_fission_logic.text_1",
                "Los adaptadores lógicos dan control por redstone al reactor.");
        m.put(p + "pack_fission_logic.text_2", "Clic derecho en uno para abrir su configuración.");
        m.put(p + "pack_fission_logic.text_3",
                "Con dos puedes montar un sistema de seguridad que apague el reactor.");

        m.put(p + "pack_fission_ports.header", "Reactor de Fisión: puertos");
        m.put(p + "pack_fission_ports.text_1", "Un reactor necesita al menos cuatro puertos.");
        m.put(p + "pack_fission_ports.text_2", "Los puertos se cambian con un Configurador.");
        m.put(p + "pack_fission_ports.text_3", "Entrada de refrigerante");
        m.put(p + "pack_fission_ports.text_4", "Entrada de combustible");
        m.put(p + "pack_fission_ports.text_5", "Salida de residuos");
        m.put(p + "pack_fission_ports.text_6", "Salida de refrigerante caliente");

        m.put(p + "pack_fusion_reactor.header", "Reactor de Fusión de Mekanism");
        m.put(p + "pack_fusion_reactor.text_1",
                "El Reactor de Fusión da millones de RF por tick.");
        m.put(p + "pack_fusion_reactor.text_2", "Los puertos se cambian con un Configurador.");
        m.put(p + "pack_fusion_reactor.text_3", "Todas las caras siguen el mismo patrón.");
        m.put(p + "pack_fusion_reactor.text_4", "Un puerto exporta la energía.");
        m.put(p + "pack_fusion_reactor.text_5",
                "La matriz láser es lo que enciende la reacción.");
        m.put(p + "pack_fusion_reactor.text_6",
                "El controlador va en el centro de la cara superior.");
        m.put(p + "pack_fusion_reactor.text_7", "Otros dos puertos meten Deuterio");
        m.put(p + "pack_fusion_reactor.text_8", "y Tritio.");

        m.put(p + "pack_fusion_activation.header", "Reactor de Fusión: arrancarlo");
        m.put(p + "pack_fusion_activation.text_1",
                "Encender un Reactor de Fusión requiere varias cosas.");
        m.put(p + "pack_fusion_activation.text_2",
                "Un Hohlraum lleno de combustible D-T va en el controlador.");
        m.put(p + "pack_fusion_activation.text_3",
                "Después hay que meterle 400 MRF con láseres en la matriz láser.");
        m.put(p + "pack_fusion_activation.text_4",
                "La cara roja del amplificador tiene que apuntar a la matriz.");
        m.put(p + "pack_fusion_activation.text_5",
                "A partir de ahí necesita suministro constante de combustible.");
        m.put(p + "pack_fusion_activation.text_6", "Deuterio por aquí");
        m.put(p + "pack_fusion_activation.text_7", "Tritio por aquí");
        m.put(p + "pack_fusion_activation.text_8",
                "Si los metes por separado, el reactor mezcla el D-T él solo a un ritmo fijo.");

        m.put(p + "pack_induction_matrix.header", "Matriz de Inducción de Mekanism");
        m.put(p + "pack_induction_matrix.text_1",
                "La Matriz de Inducción almacena una cantidad enorme de energía.");
        m.put(p + "pack_induction_matrix.text_2", "Las aristas tienen que ser carcasas.");
        m.put(p + "pack_induction_matrix.text_3",
                "Las caras pueden ser carcasas o cristal estructural.");
        m.put(p + "pack_induction_matrix.text_4", "Los puertos mueven la energía dentro y fuera.");
        m.put(p + "pack_induction_matrix.text_5", "Se cambian con un Configurador.");
        m.put(p + "pack_induction_matrix.text_6",
                "Las celdas de inducción suben cuánta energía aguanta.");
        m.put(p + "pack_induction_matrix.text_7",
                "Los proveedores de inducción suben a qué velocidad se carga.");
        m.put(p + "pack_induction_matrix.text_8", "Necesita al menos uno de cada.");

        m.put(p + "pack_sps.header", "Supercritical Phase Shifter");
        m.put(p + "pack_sps.text_1",
                "El SPS convierte Polonio en Antimateria, y se bebe la energía haciéndolo.");
        m.put(p + "pack_sps.text_2", "Los puertos se cambian con un Configurador.");
        m.put(p + "pack_sps.text_3", "Todas las caras se construyen con este patrón.");
        m.put(p + "pack_sps.text_4",
                "Un lado necesita un puerto en el centro para la energía.");
        m.put(p + "pack_sps.text_5",
                "Por dentro, una Bobina Supercargada pegada a ese puerto.");
        m.put(p + "pack_sps.text_6",
                "Con dos bobinas absorbe energía al ritmo máximo.");
        m.put(p + "pack_sps.text_7", "Un puerto mete el Polonio.");
        m.put(p + "pack_sps.text_8", "Otro saca la Antimateria.");

        m.put(p + "pack_turbine.header", "Turbina Industrial de Mekanism");
        m.put(p + "pack_turbine.text_1",
                "La Turbina Industrial quema refrigerante caliente para generar energía.");
        m.put(p + "pack_turbine.text_2", "Las aristas tienen que ser carcasas de turbina.");
        m.put(p + "pack_turbine.text_3",
                "Las caras pueden ser carcasas, cristal estructural, válvulas o rejillas.");
        m.put(p + "pack_turbine.text_4", "Las válvulas meten vapor, o sacan la energía.");
        m.put(p + "pack_turbine.text_5",
                "Los rotores se apilan en la columna central. Cada uno lleva dos aspas, hasta 28 en total.");
        m.put(p + "pack_turbine.text_6",
                "El Complejo Rotacional va encima del rotor, justo en el centro.");
        m.put(p + "pack_turbine.text_7",
                "Los Dispersores de Presión tienen que llenar esa capa entera alrededor del complejo, sin huecos.");
        m.put(p + "pack_turbine.text_8",
                "De esa capa hacia arriba, las rejillas pueden ocupar las caras exteriores. También expulsan el agua.");
        m.put(p + "pack_turbine.text_9", "Las Bobinas Electromagnéticas van encima del complejo.");
        m.put(p + "pack_turbine.text_10",
                "Cada bobina tiene que tocar el complejo u otra bobina. Las sueltas no cuentan.");
        m.put(p + "pack_turbine.text_11",
                "Los Condensadores de Saturación devuelven el vapor a agua. Son opcionales, pero van en la capa de bobinas o por encima.");
        m.put(p + "pack_turbine.text_12",
                "La cara superior también puede ser de rejillas, si necesitas más caudal.");

        m.put(p + "tag.modern_foundry", "Modern Foundry");
        m.put(p + "tag.modern_foundry.description",
                "Fundidores, smelteries y todo lo que vierte metal fundido en un molde.");
        m.put(p + "tag.botany_pots", "Botany Pots");
        m.put(p + "tag.botany_pots.description", "Un cultivo por bloque, sin necesidad de tierra de labor.");

        m.put(p + "mf_melter.header", "Tu primer fundidor");
        m.put(p + "mf_melter.text_1",
                "El Seared Melter es el pequeño que montas antes del Smeltery de verdad.");
        m.put(p + "mf_melter.text_2",
                "Funde una cosa cada vez, y tiene que ir encima de su combustible.");
        m.put(p + "mf_melter.text_3",
                "Un Seared Heater quema combustible sólido debajo. Un tanque con lava también sirve.");
        m.put(p + "mf_melter.text_4", "Un Faucet en el lateral vierte lo fundido.");
        m.put(p + "mf_melter.text_5",
                "A un Casting Basin para bloques, o a una Casting Table para lingotes y piezas.");
        m.put(p + "mf_melter.text_6",
                "Fundidor, calentador, grifo, cuenco y mesa: ese es todo el montaje inicial.");

        m.put(p + "mf_smeltery.header", "Construir un Smeltery");
        m.put(p + "mf_smeltery.text_1",
                "El Smeltery funde varias pilas a la vez y alea metales entre sí.");
        m.put(p + "mf_smeltery.text_2", "Empieza por un suelo macizo de bloques seared.");
        m.put(p + "mf_smeltery.text_3",
                "Las paredes van por fuera. El interior queda hueco, y tiene que quedarse vacío.");
        m.put(p + "mf_smeltery.text_4",
                "El Smeltery Controller va en una pared, a la altura de la primera capa interior.");
        m.put(p + "mf_smeltery.text_5",
                "Un Seared Fuel Tank en la pared guarda la lava que lo alimenta.");
        m.put(p + "mf_smeltery.text_6",
                "Un Seared Drain es por donde entra y sale el metal fundido.");
        m.put(p + "mf_smeltery.text_7",
                "Cuanto más altas las paredes, más aguanta. El interior también puede crecer, hasta un límite.");
        m.put(p + "mf_smeltery.text_8",
                "Si no se forma, el controlador te dice qué bloque está mal y dónde.");

        m.put(p + "mf_casting.header", "Colar metal");
        m.put(p + "mf_casting.text_1", "El metal fundido no sirve de nada hasta que lo viertes en algo.");
        m.put(p + "mf_casting.text_2",
                "Un Faucet tira de un tanque, de un drain o del propio Smeltery.");
        m.put(p + "mf_casting.text_3",
                "El Casting Basin hace bloques. Clic derecho en el grifo para verter.");
        m.put(p + "mf_casting.text_4",
                "La Casting Table hace lingotes y piezas de herramienta, usando un molde.");
        m.put(p + "mf_casting.text_5",
                "Los canales llevan el vertido más lejos, así un grifo alimenta una fila de mesas.");
        m.put(p + "mf_casting.text_6",
                "Redstone a un grifo lo mantiene vertiendo, que es lo que convierte esto en una cadena de producción.");

        m.put(p + "mf_ports.header", "Meter y sacar cosas");
        m.put(p + "mf_ports.text_1",
                "Tres bloques mueven cosas a través de la pared del Smeltery, y cada uno hace una cosa.");
        m.put(p + "mf_ports.text_2", "El Seared Drain mueve fluido en los dos sentidos.");
        m.put(p + "mf_ports.text_3",
                "El Seared Duct hace lo mismo, pero solo con el fluido que tenga puesto en su filtro.");
        m.put(p + "mf_ports.text_4",
                "El Seared Chute mueve objetos: mineral hacia dentro, o sobras hacia fuera.");
        m.put(p + "mf_ports.text_5",
                "Los tres cuentan como bloque de pared, así que sustituyen a un ladrillo, no se ponen al lado.");
        m.put(p + "mf_ports.text_6",
                "Tolvas y tuberías hablan con ellos con normalidad, y así se automatiza un Smeltery.");

        m.put(p + "bp_pot.header", "La Botany Pot");
        m.put(p + "bp_pot.text_1",
                "Una Botany Pot cultiva una planta en un bloque, sin tierra de labor ni reglas de luz.");
        m.put(p + "bp_pot.text_2",
                "Primero el sustrato, después el cultivo. Los dos son objetos que sueltas dentro.");
        m.put(p + "bp_pot.text_3",
                "El sustrato decide qué puede crecer y a qué ritmo. El mismo cultivo en mejor sustrato tarda menos.");
        m.put(p + "bp_pot.text_4", "Cuando está listo, rompes el cultivo de la maceta a mano.");
        m.put(p + "bp_pot.text_5",
                "Qué sustratos y cultivos existen va por datos, así que un pack puede añadirlos o cambiarlos.");
        m.put(p + "bp_pot.text_6",
                "Hay macetas de terracota, hormigón y todos los ladrillos. Todas se comportan igual.");

        m.put(p + "bp_hopper_pot.header", "La Hopper Botany Pot");
        m.put(p + "bp_hopper_pot.text_1",
                "Una maceta normal cultiva pero no recoge nada. La versión Hopper sí.");
        m.put(p + "bp_hopper_pot.text_2",
                "Se cosecha sola y empuja lo que sale a lo que tenga debajo.");
        m.put(p + "bp_hopper_pot.text_3", "Un cofre, una tolva, una tubería: vale cualquier cosa que acepte objetos.");
        m.put(p + "bp_hopper_pot.text_4",
                "Esa es la única diferencia. Mismos sustratos, mismos cultivos, misma velocidad.");
        m.put(p + "bp_hopper_pot.text_5",
                "Una pared de macetas hopper sobre una fila de cofres es una granja sin piezas móviles.");

        m.put(p + "bp_waxed_pot.header", "La Waxed Botany Pot");
        m.put(p + "bp_waxed_pot.text_1", "La maceta encerada es puramente decorativa.");
        m.put(p + "bp_waxed_pot.text_2",
                "Siempre dibuja su cultivo completamente crecido, y nunca hace tick.");
        m.put(p + "bp_waxed_pot.text_3",
                "No crece nada ni suelta nada, así que cien de ellas no le cuestan nada al servidor.");
        m.put(p + "bp_waxed_pot.text_4",
                "Para el invernadero que quieres mirar, no para el que quieres cosechar.");

        m.put(p + "tag.ex_deorum", "Ex Deorum");
        m.put(p + "tag.ex_deorum.description",
                "Barriles, crisoles, cribas y martillos: sacar algo de la nada.");

        m.put(p + "exd_barrel.header", "El Barril");
        m.put(p + "exd_barrel.text_1",
                "En un skyblock el Barril es de donde sale la tierra, y de donde salen casi todos los fluidos.");
        m.put(p + "exd_barrel.text_2",
                "Echa materia orgánica dentro y se composta. Cuando se llena la barra, sale un bloque de tierra.");
        m.put(p + "exd_barrel.text_3",
                "Lleno de un fluido en cambio mezcla: sueltas el objeto adecuado y el fluido cambia.");
        m.put(p + "exd_barrel.text_4",
                "Agua más lava da piedra. Agua y un champiñón dan Agua de Bruja, que genera cosas peores.");
        m.put(p + "exd_barrel.text_5",
                "Los Barriles de Piedra hacen lo mismo pero no arden cuando les metes lava.");
        m.put(p + "exd_barrel.text_6",
                "Un barril a cielo abierto se va llenando de lluvia, y esa es el agua gratis con la que empiezas.");

        m.put(p + "exd_crucible.header", "El Crisol");
        m.put(p + "exd_crucible.text_1",
                "Un Crisol funde sólidos en fluido, y el crisol que uses decide qué puede fundir.");
        m.put(p + "exd_crucible.text_2",
                "Los crisoles de madera funden hojas, brotes y madera en agua.");
        m.put(p + "exd_crucible.text_3",
                "El Crisol de Porcelana se ocupa de la piedra, y la convierte en lava.");
        m.put(p + "exd_crucible.text_4",
                "Necesita una fuente de calor debajo. Las antorchas van lentas; lava y magma, mucho más rápido.");
        m.put(p + "exd_crucible.text_5",
                "La fuente de calor marca el ritmo de fundido, así que mejorar lo de debajo se nota de verdad.");
        m.put(p + "exd_crucible.text_6",
                "La porcelana es arcilla cocida: fabricas el crisol sin cocer y lo metes al horno.");

        m.put(p + "exd_sieve.header", "La Criba");
        m.put(p + "exd_sieve.text_1",
                "Todo lo que minas en un skyblock sale de una Criba, puñado a puñado.");
        m.put(p + "exd_sieve.text_2",
                "Primero le pones una malla, luego tierra, grava, arena o polvo, y haces clic para cribar.");
        m.put(p + "exd_sieve.text_3",
                "La malla decide qué puede caer. La de cuerda saca semillas; pedernal, hierro, diamante y netherita llegan más lejos.");
        m.put(p + "exd_sieve.text_4",
                "Una Criba Comprimida acepta un bloque comprimido y se lo hace entero de una vez.");
        m.put(p + "exd_sieve.text_5",
                "Las cribas pegadas criban todas a la vez si pasas el clic por encima, así que monta una fila.");
        m.put(p + "exd_sieve.text_6",
                "Los trozos de mineral que salen van al horno, o a un Smeltery si ya lo tienes.");

        m.put(p + "exd_hammer.header", "Martillos y Ganchos");
        m.put(p + "exd_hammer.text_1",
                "El Martillo va rompiendo la piedra un escalón cada vez, y cada escalón alimenta la criba.");
        m.put(p + "exd_hammer.text_2", "Adoquín a grava, grava a arena, arena a polvo.");
        m.put(p + "exd_hammer.text_3",
                "Los martillos mejores van más rápido, y los comprimidos trabajan un bloque comprimido entero.");
        m.put(p + "exd_hammer.text_4",
                "El Gancho es la otra herramienta inicial: duplica lo que sueltan las hojas.");
        m.put(p + "exd_hammer.text_5",
                "Pon un Gusano de Seda en unas hojas y se vuelven Hojas Infestadas, que se rompen en cuerda.");
        m.put(p + "exd_hammer.text_6",
                "La cuerda hace tu primera malla, así que los gusanos son lo que desbloquea la criba.");

        m.put(p + "exd_mechanical.header", "Automatizarlo");
        m.put(p + "exd_mechanical.text_1",
                "Hacer clic en cribas a mano cansa. Los dos trabajos tienen versión con energía.");
        m.put(p + "exd_mechanical.text_2",
                "El Martillo Mecánico tritura solo, consumiendo Forge Energy.");
        m.put(p + "exd_mechanical.text_3", "La Criba Mecánica se encarga del cribado, malla incluida.");
        m.put(p + "exd_mechanical.text_4",
                "Los dos tienen lado de entrada y de salida, así que tolvas y tuberías los encadenan.");
        m.put(p + "exd_mechanical.text_5",
                "Cobblegen a martillo a criba a horno es el ciclo entero del skyblock, sin tocar nada.");
        return Collections.unmodifiableMap(m);
    }
}
