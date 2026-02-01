package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class f implements l<Float> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ Float a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        float m4;
        m4 = fastParser.m(bufferedReader);
        return Float.valueOf(m4);
    }
}
