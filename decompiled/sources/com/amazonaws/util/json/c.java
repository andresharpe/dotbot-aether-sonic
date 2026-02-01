package com.amazonaws.util.json;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Date;

/* loaded from: classes.dex */
public interface c {
    c a() throws IOException;

    c b() throws IOException;

    c c() throws IOException;

    void close() throws IOException;

    c d() throws IOException;

    c e(long j4) throws IOException;

    c f(double d4) throws IOException;

    void flush() throws IOException;

    c g(String str) throws IOException;

    c h(Date date) throws IOException;

    c i(ByteBuffer byteBuffer) throws IOException;

    c j(boolean z3) throws IOException;

    c k(Number number) throws IOException;

    c l(String str) throws IOException;

    c value() throws IOException;
}
