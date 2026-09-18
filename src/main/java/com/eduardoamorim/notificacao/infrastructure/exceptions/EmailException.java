package com.eduardoamorim.notificacao.infrastructure.exceptions;

import com.eduardoamorim.notificacao.business.EmailService;

public class EmailException extends Exception {

    public EmailException(String mensagem){
        super(mensagem);
    }

    public EmailException(String mensagem, Throwable throwable){
        super(mensagem,throwable);
    }
}
