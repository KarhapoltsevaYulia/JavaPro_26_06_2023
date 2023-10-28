package hw17;

import hw17.Exception.FileMaxSizeReachedException;

import java.io.*;

public class FileLogger extends FileLoggerConfiguration {

        static String[] properties = null;
        static Boolean infoProperties = null;
        static Boolean debagProperties = null;

        public FileLogger(String fileName) throws FileNotFoundException {
            FileLoggerConfigurationLoader fileLoggerConfigurationLoader = new FileLoggerConfigurationLoader();
            fileLoggerConfigurationLoader.load(fileName);
        }

        public void recordFile() throws IOException {

            try (PrintWriter buf = new PrintWriter(new FileWriter(fileNam, true))) {

                dividingTermsIntoValues(buf);
                buf.write(formatWriterFile);
                try {
                    checkFileLength(fileNam);
                } catch (FileMaxSizeReachedException e) {
                    File file = new File(fileNam);
                    file.createNewFile();
                }

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public static void checkFileLength(String fileName) throws IOException, FileMaxSizeReachedException { //проверка размера файла

            File f = new File(fileName);
            long len = f.length();

            if (MAXSIZEFILE <= len) {
                System.out.println(MAXSIZEFILE + " = Limit Size File!!!!! Size File = " + len);
                System.out.println(f.getName());
                System.out.println(f.getAbsolutePath());
                throw new FileMaxSizeReachedException("LimitFileMax");
            }
        }

        public void debug(String message, PrintWriter buf) throws IOException {
            setFormatWriterFile1("Debug", message);
            buf.println(formatWriterFile);
            info("INFO", buf);
        }

        public void info(String message, PrintWriter buf) throws IOException {
            setFormatWriterFile1("Info", message);
            buf.println(formatWriterFile);
        }

        private void dividingTermsIntoValues(PrintWriter buf) throws IOException {
            buf.println();
            for (Integer key : loggingLevel.keySet()) {
                String line = loggingLevel.get(key);
                properties = line.split("\\|");
                infoProperties = Boolean.parseBoolean(properties[1]);
                debagProperties = Boolean.parseBoolean(properties[2]);
                if (debagProperties) {
                    debug("Debag", buf);
                } else {
                    if (infoProperties) {
                        info("Info", buf);
                    } else {
                        setFormatWriterFile1("NULL", "null message");
                        buf.println(formatWriterFile);
                    }
                }
            }
        }
    }


