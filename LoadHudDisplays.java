package HIghHomework5;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

class LoadHudDisplays implements LoadDisplayInterface {
    private String filename;

    public LoadHudDisplays(String filename) {
        this.filename = filename;
    }

    public ArrayList<String> load() {
        ArrayList<String> list = new ArrayList<String>();
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader r = new BufferedReader(fr);
            String line = r.readLine();
            while (line != null) {
                line = line.trim();
                if (!line.equals("")) {
                    list.add(line);
                }
                line = r.readLine();
            }
            r.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}