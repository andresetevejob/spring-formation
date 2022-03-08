package com.afspring.app;

import com.afspring.app.withdi.provider.HelloMessageProvider;
import com.afspring.app.withdi.provider.MessageProvider;
import com.afspring.app.withdi.render.MessageRenderer;
import com.afspring.app.withdi.render.StandartOutputRender;

public class MainDecoupled {
    public static void main(String[] args){
        MessageProvider messageProvider  = new HelloMessageProvider();
        MessageRenderer messageRenderer = new StandartOutputRender();
        messageRenderer.setMessageProvider(messageProvider);
        messageRenderer.render();
    }
}
