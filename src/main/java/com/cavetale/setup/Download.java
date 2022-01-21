package com.cavetale.setup;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;

public final class Download {
    private Download() { }

    /**
     * Download from URL to file.
     * Found here: https://www.baeldung.com/java-download-file
     */
    public static boolean to(URL url, File target) {
        if (target.exists()) return true;
        try {
            ReadableByteChannel readableByteChannel = Channels.newChannel(url.openStream());
            FileOutputStream fileOutputStream = new FileOutputStream(target);
            FileChannel fileChannel = fileOutputStream.getChannel();
            fileOutputStream.getChannel().transferFrom(readableByteChannel, 0, Long.MAX_VALUE);
            return true;
        } catch (IOException ioe) {
            throw new UncheckedIOException(ioe);
        }
    }

    public static boolean to(String url, String target) {
        try {
            return to(new URL(url), new File(target));
        } catch (MalformedURLException ioe) {
            throw new UncheckedIOException(ioe);
        }
    }
}
