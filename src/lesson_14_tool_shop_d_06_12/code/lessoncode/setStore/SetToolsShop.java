package lesson_14_tool_shop_d_06_12.code.lessoncode.setStore;

import lesson_14_tool_shop_d_06_12.code.lessoncode.setStore.entity.SetTool;
import lesson_14_tool_shop_d_06_12.code.lessoncode.setStore.entity.SetToolsRepository;
import lesson_14_tool_shop_d_06_12.code.lessoncode.setStore.entity.Tool;
import lesson_14_tool_shop_d_06_12.code.lessoncode.setStore.entity.ToolRepository;

public class SetToolsShop {
    public static void main(String[] args) {

        ToolRepository repository = new ToolRepository();

         /*
        что произойдет после выполнения 9 строки?

        - создастся объект на основании класса TollRepository
        - в этом объекте объявлен массив типа Tool, но без конкретных параметров
        - в момент запуска конструктора для TollRepository у нас создается массив из 6 элементов,
        ссылка на этот массив сохраняется в переменной экземпляра класса tools,
        и далее создаем 6 уникальных экземпляров класса tool - у каждого будут свои параметры
        и ссылки на них сохраняем в каждом элементе нашего массива

        После этого в памяти у JVM будет созданы следующе объекты (экземпляры классов):
        1) ToolRepository
        2) Шесть экземпляров класса Tool
        3) Массив из шести элементов типа Tool в каждой ячейки которого будет записана ссылка на соответствующий экземпляр класса Tool из ранее созданных

        Ссылка на этот массив будет храниться в переменной tools внутри экземпляра класса ToolRepository

         */
        SetTool setTool1 = new SetTool(repository.getTools()[0],repository.getTools()[1]);
        SetTool setTool2 = new SetTool(repository.getTools()[2],repository.getTools()[3]);
        SetTool setTool3 = new SetTool(repository.getTools()[4],repository.getTools()[5]);


        SetToolsRepository setToolsRepository = new SetToolsRepository(setTool1, setTool2, setTool3);


          /*
        что произойдет после выполнения 39 строки?

        1) создается первый экземпляр класса SetTool
        2) В момент создания этого экземпляра класса java создает массив из
        двух элементов типа Tool и ссылку на этот массив сохраняет в переменной экз класса setTools
        3) В результате работы конструктора этого экземпляра класса в каждый элемент
        этого массива сохраняется ссылка, которая хранится
        в экз класса ToolRepository (который мы создали до этого) в переменной tools в соответствующих ячейках

        4) то же самое происходит при создании еще двух экземпляров класса SetTool

        5) создаем экземпляр класса SetToolsRepository
        6) В момент создания этого экземпляра класса java создает массив из трех элементов типа
        SetTool и ссылку на этот массив сохраняет в переменной экз класса setToolsRepo
        7) В результате работы конструктора этого экземпляра класса в каждый
        элемент этого массива setToolsRepo сохраняется ссылка, которую мы передаем
         в качестве аргументов конструктора, а именно три экземпляра класса SetTool, которые мы создавали в п.п. 1 - 4
 */


        for (int i = 0; i < setToolsRepository.getSetToolsRepo().length; i++) {

            System.out.println("Набор № " + i + ": ");

            SetTool set = setToolsRepository.getSetToolsRepo()[i];// lссылка на набор

            Tool toolFromSet1 = set.getSetTools()[0];// ссылка на 1 инструмент
            Tool toolFromSet2 = set.getSetTools()[1];// ссылка на 2 инструмент

            System.out.println("Первый элемент нашего набора: " );
            System.out.println("id: " + toolFromSet1.getId());
            System.out.println("tool name: " + toolFromSet1.getToolName());
            System.out.println("description name: " + toolFromSet1.getToolDescription());

            System.out.println("Второй элемент нашего набора: " );
            System.out.println("id: " + toolFromSet2.getId());
            System.out.println("tool name: " + toolFromSet2.getToolName());
            System.out.println("description name: " + toolFromSet2.getToolDescription());
            System.out.println();
        }



    }
}
