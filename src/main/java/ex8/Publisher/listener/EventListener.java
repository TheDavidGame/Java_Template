package ex8.Publisher.listener;

import java.io.File;

public interface EventListener {
    void update(String eventType, File file);
}
