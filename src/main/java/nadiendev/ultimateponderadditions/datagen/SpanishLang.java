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
                "Un Ponedero convierte una gallina en un generador de recursos tranquilo y ordenado: ni paseos ni cacareos.");
        m.put(p + "chickens_roost.text_2",
                "Mete hasta dieciséis gallinas del mismo tipo. Cuanto más rápidas, más ponen.");
        m.put(p + "chickens_roost.text_3",
                "Cada gallina suelta su propio recurso en vez de un huevo: hierro, redstone, piedra luminosa y demás.");
        m.put(p + "chickens_roost.text_4",
                "Un Recolector al lado del ponedero lo vacía solo.");
        m.put(p + "chickens_roost.text_5",
                "El Ponedero Mecánico es la versión con energía: más rápido, y admite mejoras.");
        m.put(p + "chickens_roost.text_6",
                "La Ganancia, el Crecimiento y la Fuerza de una gallina deciden cuánto produce y a qué ritmo.");

        m.put(p + "chickens_breeder.header", "Criar gallinas");
        m.put(p + "chickens_breeder.text_1",
                "Los tipos nuevos de gallina salen de la cría, y la cría ocurre en una Criadora.");
        m.put(p + "chickens_breeder.text_2",
                "Dos gallinas y semillas. La cría puede salir del tipo de cualquiera de los padres, o del tipo hijo.");
        m.put(p + "chickens_breeder.text_3",
                "Cada cruce tiene su receta: una Gallina de Hierro y una de Pedernal dan una de Oro, por ejemplo.");
        m.put(p + "chickens_breeder.text_4",
                "Los Nidos aparecen de forma natural en el mundo y guardan la primera gallina de un tipo salvaje.");
        m.put(p + "chickens_breeder.text_5",
                "El Nido Mecánico es la versión fabricada y con energía que montas cuando ya estás asentado.");
        m.put(p + "chickens_breeder.text_6",
                "Usa un Analizador sobre una gallina para leer sus estadísticas antes de decidir qué cruzar.");
        m.put(p + "chickens_breeder.text_7",
                "Cruzar dos padres con buenas estadísticas es como se empujan Ganancia y Crecimiento hasta el tope de diez.");

        m.put(p + "chickens_henhouse.header", "El Gallinero");
        m.put(p + "chickens_henhouse.text_1",
                "Las gallinas sueltas siguen poniendo. El Gallinero es lo que recoge lo que dejan.");
        m.put(p + "chickens_henhouse.text_2",
                "Recoge cualquier cosa que suelte una gallina en el chunk que lo rodea.");
        m.put(p + "chickens_henhouse.text_3",
                "También se come balas de heno: cada bala convertida en tierra le permite recoger bastante más.");
        m.put(p + "chickens_henhouse.text_4",
                "Hay un Gallinero por cada tipo de madera, para que pegue con el corral que hayas construido.");
        m.put(p + "chickens_henhouse.text_5",
                "Barato y de principio de partida. Cuando tengas energía, un Ponedero con Recolector lo supera de largo.");

        m.put(p + "chickens_incubator.header", "La Incubadora");
        m.put(p + "chickens_incubator.text_1",
                "La Incubadora convierte Huevos de Colores en la gallina que llevan pintada.");
        m.put(p + "chickens_incubator.text_2",
                "Mete los huevos y espera. No necesita energía, solo calor.");
        m.put(p + "chickens_incubator.text_3",
                "El calor viene de lava o fuego debajo y al lado. Más calor, más rápido eclosionan.");
        m.put(p + "chickens_incubator.text_4",
                "Las gallinas que salen así conservan las estadísticas guardadas en el huevo, así que un buen huevo hay que guardarlo.");
        m.put(p + "chickens_incubator.text_5",
                "Esta es la forma rápida de convertir una línea de cría en una granja que funcione.");

        m.put(p + "chickens_roost_generator.header", "Energía a partir de gallinas");
        m.put(p + "chickens_roost_generator.text_1",
                "Las gallinas no solo ponen recursos sólidos. Las máquinas Avian los convierten en energía y fluidos.");
        m.put(p + "chickens_roost_generator.text_2",
                "Empieza con un Ponedero Mecánico manteniendo una bandada produciendo sin parar.");
        m.put(p + "chickens_roost_generator.text_3",
                "El Convertidor de Flujo Avian convierte esa producción en Forge Energy.");
        m.put(p + "chickens_roost_generator.text_4",
                "El Convertidor de Fluidos Avian hace lo mismo con fluidos: lava de las Gallinas de Lava, por ejemplo.");
        m.put(p + "chickens_roost_generator.text_5",
                "El Convertidor Químico Avian se ocupa de la parte química para los mods que la quieran.");
        m.put(p + "chickens_roost_generator.text_6",
                "Las mejoras de RF en las ranuras de la máquina suben producción, eficiencia y tamaño del búfer.");
        m.put(p + "chickens_roost_generator.text_7",
                "Una pared de ponederos alimentando convertidores es una central eléctrica perfectamente seria a media partida.");

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

        return Collections.unmodifiableMap(m);
    }
}
