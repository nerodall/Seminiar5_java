import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        FileBackup fb = new FileBackup();
        WriteXO xo = new WriteXO();
        int [] array = {0, 1, 2, 3, 1, 2, 0, 3, 2};

        // Создание бэкапа
        try {
            fb.Backup("C:\\Users\\nerod\\OneDrive\\Рабочий стол\\GaussView_6.0.16_Win64",
                    "C:\\Users\\nerod\\OneDrive\\Рабочий стол\\backup");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

        //Заполнение файла массивом + вывод его размера
        xo.WriteArray(array,"output.txt");
        xo.GetSize("output.txt");
    }
}
