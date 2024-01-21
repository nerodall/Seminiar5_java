import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Data
@RequiredArgsConstructor
public class FileBackup {
    /**
     * Метод для копирования всех файлов из одной директории в другую (бэкап)
     * @param path путь откуда будем забирать файлы
     * @param backupPath куда будем делать бэкап
     * @throws IOException
     */
    public void Backup(String path, String backupPath) throws IOException {
        Path backup = Paths.get(backupPath);
        File f = new File(path);
        File[] files = f.listFiles();
        for (File file : files){
            System.out.println(file.getName());
            Path targetFilePath = backup.resolve(file.toPath().getFileName());
            Files.copy(Path.of(path + "\\" + file.getName()), targetFilePath);
        }

    }
}

