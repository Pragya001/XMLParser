package com.demo.xml.util;

import com.sun.xml.bind.marshaller.CharacterEscapeHandler;

import java.io.IOException;
import java.io.Writer;

public class CharacterEscapeHandlerUtil implements CharacterEscapeHandler {

    public void escape(char[] buf, int start, int len, boolean isAttValue,
                       Writer out) throws IOException {

        for (int i = start; i < start + len; i++) {
            char ch = buf[i];
            out.write(ch);
        }
    }
}
