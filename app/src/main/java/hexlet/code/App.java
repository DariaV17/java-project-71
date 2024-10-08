package hexlet.code;
import picocli.CommandLine;
import picocli.CommandLine.Command;
import picocli.CommandLine.Option;
import picocli.CommandLine.Parameters;


import java.util.concurrent.Callable;

@CommandLine.Command(name = "gendiff",  mixinStandardHelpOptions = true, description = "Compares two configuration files and shows a difference.")
public class App implements Callable<Integer> {
    @Parameters(index = "0", paramLabel = "filepath1", description = "path to first file")
    private String filepath1;
    @Parameters(index = "0", paramLabel = "filepath2", description = "path to second file")
    private String filepath2;
    @Option(names = {"-f", "-format"}, paramLabel = "format", description = "output format [default: stylish]")
    private String format;

    @Override
    public Integer call() throws Exception {
        return 0;
    } public static void main(String[] args) {
        new CommandLine(new App()).execute("--help");
    }
}
