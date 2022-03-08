package com.afspring.app.withdi.render;

import com.afspring.app.withdi.provider.MessageProvider;

public class StandartOutputRender implements MessageRenderer{
    private MessageProvider messageProvider;
    @Override
    public void render() {
        if(this.messageProvider==null){
            throw new RuntimeException(
                    "You must set the property messageProvider of class:"+ StandartOutputRender.class.getName());
        }
        System.out.println(messageProvider.getMessage());
    }

    @Override
    public void setMessageProvider(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public MessageProvider getMessageProvider() {
        return messageProvider;
    }
}
