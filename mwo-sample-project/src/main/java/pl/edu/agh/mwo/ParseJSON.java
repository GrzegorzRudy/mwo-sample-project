package pl.edu.agh.mwo;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jdk.internal.org.jline.terminal.TerminalBuilder;

import java.io.IOException;
import java.net.URL;
import java.util.List;

public class ParseJSON {
    ObjectMapper objectMapper = new ObjectMapper();
    List<Race> model =  objectMapper.readValue(new URL("https://api.openf1.org/v1/sessions?session_name=Race&year=2024"), new TypeReference<List<Race>>() {});


    public ParseJSON() throws IOException {
    }
}
