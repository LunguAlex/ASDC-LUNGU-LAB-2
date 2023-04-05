import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Student[] studentBubbleSort;
        studentBubbleSort = MethodsManager.readingFIle();

        System.out.println("\nBubble Sort: ");
        MethodsManager.bubbleSort(studentBubbleSort);
//        ManagerOfMethods.printing(studentBubbleSort);


        Student[] studentInsertionSort;
        studentInsertionSort = MethodsManager.readingFIle();

        System.out.println("\nInsertion Sort: ");
        MethodsManager.insertionSort(studentInsertionSort);
//        ManagerOfMethods.printing(studentInsertionSort);


        Student[] studentSelectionSort;
        studentSelectionSort = MethodsManager.readingFIle();

        System.out.println("\nSelection Sort: ");
        MethodsManager.selectionSort(studentSelectionSort);
//        ManagerOfMethods.printing(studentSelectionSort);


        Student[] studentShellSort;
        studentShellSort = MethodsManager.readingFIle();

        System.out.println("\nShell Sort: ");
        MethodsManager.shellSort(studentShellSort);
//        ManagerOfMethods.printing(studentShellSort);
    }
}