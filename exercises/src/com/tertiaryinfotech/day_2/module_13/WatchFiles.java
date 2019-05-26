package com.tertiaryinfotech.day_2.module_13;

import java.io.IOException;
import java.nio.file.*;

public class WatchFiles {
    public static void main(String[] args) throws IOException, InterruptedException {
        String directory = "src/com/tertiaryinfotech/day_2/module_13/";
        // Create a WatchService
        WatchService service = FileSystems.getDefault().newWatchService();
        // Register WatchEvent for the path
        Paths.get(directory).register(service,
                StandardWatchEventKinds.ENTRY_CREATE,
                StandardWatchEventKinds.ENTRY_DELETE,
                StandardWatchEventKinds.ENTRY_MODIFY);

        while (true) {
            WatchKey watchKey = service.take();
            for (final WatchEvent<?> event : watchKey.pollEvents()) {
                System.out.println(event.kind());
            }
            watchKey.reset();
        }
    }
}
