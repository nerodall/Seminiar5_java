import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

@Data
@RequiredArgsConstructor
public class WriteXO {
    /**
     * Метод для заполнения файла содержимым массива
     * @param arr
     */
    public void WriteArray(int [] arr){
        try (DataOutputStream dataOut = new DataOutputStream(new FileOutputStream("output.txt"))) {
            for (int i = 0; i < arr.length; i++) {
                dataOut.writeByte(arr[i]);
            }
        } catch (IOException e) {
            System.out.println("Ошибка записи в файл: " + e.getMessage());
        }
    }

    /**
     * Метод для получения размера файла в байтах
     * @param path путь к файлу
     */
    public void GetSize(String path){
        File file = new File(path);

        if (file.exists()){
            System.out.println("Размер файла " + file.length() + " байт");
        }
        else {
            System.out.println("Файл не найден");
        }

    }
}


