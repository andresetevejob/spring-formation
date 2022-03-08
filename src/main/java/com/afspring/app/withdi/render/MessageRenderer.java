package com.afspring.app.withdi.render;

import com.afspring.app.withdi.provider.MessageProvider;

public interface MessageRenderer {
    void render();
    void setMessageProvider(MessageProvider provider);
    MessageProvider getMessageProvider();
}
