package top.rongxiaoli.betelgeuse.utils.file;

import top.rongxiaoli.betelgeuse.Betelgeuse;
import top.rongxiaoli.betelgeuse.logging.Logger;

import java.io.File;
import java.io.IOException;

// Todo
public class FileOperation {
    private final File file;

    /**
     * FileOperation initialization process. If not exist, create one.
     *
     * @param fileFullPath The name and the full path of the file.
     */
    public FileOperation(String fileFullPath) {
        file = new File(fileFullPath);
        if (file.exists()) {
        }
        else if (file.getParentFile().exists()) {
            SecurityManager sm = new SecurityManager();
            try {
                sm.checkWrite(file.getAbsolutePath());
                file.createNewFile();
            } catch (SecurityException e) {
                Betelgeuse.instance.logger.log(Logger.Level.Error, "The target path: \"" + file.getAbsolutePath() + "\" cannot be opened. ", e);
            } catch (IOException e) {
            }

        }
    }

    /**
     * FileOperation initialization process.
     *
     * @param fileFullPath The name and the full path of the file.
     * @param isDirectory  Is the given path a directory.
     */
    public FileOperation(String fileFullPath, boolean isDirectory) {
        file = new File(fileFullPath);
    }
}
