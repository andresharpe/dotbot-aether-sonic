package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class i implements l<String> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ String a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        String q4;
        q4 = fastParser.q(bufferedReader);
        return q4;
    }
}
