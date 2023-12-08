package lesson_14_tool_shop.my_tool_shop;

public class AppMain {

    public static void main(String[] args) {

        SkladInstrument khranenie = new SkladInstrument(); // создание базы инструментов через конструктор  SkladInstrument

        ComplektaciaInstrumentov complektaciaInstrumentov1 = new ComplektaciaInstrumentov(khranenie.getInstruments()[0],khranenie.getInstruments()[1]); // сохранение в комплектацию 1 - инструмента 1 и 2, через обращение к классу SkladInstrument ссылка "khranenie" + метод getInstruments, который верет конкретный инструмент из массива инструментов по его номеру.
        ComplektaciaInstrumentov complektaciaInstrumentov2 = new ComplektaciaInstrumentov(khranenie.getInstruments()[2],khranenie.getInstruments()[3]);
        ComplektaciaInstrumentov complektaciaInstrumentov3 = new ComplektaciaInstrumentov(khranenie.getInstruments()[4], khranenie.getInstruments()[5]);

        SkladNaborov skladNaborov = new SkladNaborov(complektaciaInstrumentov1,complektaciaInstrumentov2,complektaciaInstrumentov3); // заполнение массива класса SkladNaborov - 3 массивами класса ComplektaciaInstrumentov
            for (int i = 0; i < skladNaborov.getNabor().length; i++) { // прогон всех наборов через печать
            System.out.println("Набор № " + i + ": ");

            ComplektaciaInstrumentov dar = skladNaborov.getNabor()[i];  // skladNaborov cсылка на конструктор SkladNaborov, ссылка dar - вытаскивает ссылку конкретного инструмента
            Instrument instrumentFromNabor1 = dar.getComplectacia()[0];  //instrumentFromNabor1 ссылка которая вытаскивает все параметры конкретного инструмента
            Instrument instrumentFromNabor2 = dar.getComplectacia()[1];

            System.out.println("Первый элемент нашего набора: ");
            System.out.println("id: " + instrumentFromNabor1.getNomerInstrument());
            System.out.println("tool name: " + instrumentFromNabor2.getNameInstrument());
            System.out.println("description name: " + instrumentFromNabor1.getOpisanieInstrument());
            System.out.println("price : " + instrumentFromNabor1.getCenaInstrument());

            System.out.println("Второй элемент нашего набора: ");
            System.out.println("id: " + instrumentFromNabor2.getNomerInstrument());
            System.out.println("tool name: " + instrumentFromNabor2.getNameInstrument());
            System.out.println("description name: " + instrumentFromNabor2.getOpisanieInstrument());
            System.out.println("price : " + instrumentFromNabor2.getCenaInstrument());
        }
    }
}
/* создается обьект на основании класса  SkladInstrument, в нем обьявлен массив  Instrument но без конкретных параметров
        - в момен  запуска конструктора SkladInstrument у нас создается массив из 6 елементов, ссылка на него хранится в переменной
        класса SkladInstrument "instruments"
        - далее создается 6 уникальных екземпляров класса  Instrument (со своими 4 параметрами)
        - ссылки на каждый из екземпляторв класса Instrument - сохраняются в массиве, который создал конструктор класса SkladInstrument

        После этого в памяти будут созданы следубщие обьекты:
        1) SkladInstrument
        2) 6 екземпляторв класса Instrument
        3) массив из 6 елементов типа Instrument, в котором лежит ссылка на соответсвующий екземпляр класса Instrument
        ....ссылка на массив из всех инструментов будет храниться в переменной "instruments"  внутри SkladInstrument

        */
        /*
        1) создается 3 екземпляра класса ComplektaciaInstrumentov
        2) в этот же момент создается 3 массива из 2 елементов типа Instrument, а ссылка на них
              сохряняется в переменную класса ComplektaciaInstrumentov "complectacia"
        3) В результате работы конструктора  экземпляра класса ComplektaciaInstrumentov, в каждый элемент этого массива сохраняется ссылка, которая хранится
        в экз класса  SkladInstrument, в переменной "instruments"

        4) создаем екземпляр класса SkladNaborov
        5)В момент создания этого экземпляра класса java создает массив из трех элементов типа ComplektaciaInstrumentov внутри екземпляра класса SkladNaborov
        и ссылку на этот массив сохраняет в переменной экз класса nabor

        6) В результате работы конструктора  экземпляра класса SkladNaborov в каждый элемент этого массива nabor сохраняется ссылка, которую мы передаем
        в качестве аргументов конструктора, а именно три экземпляра класса ComplektaciaInstrumentov, которые мы создавали в п.п. 1 - 4

        */