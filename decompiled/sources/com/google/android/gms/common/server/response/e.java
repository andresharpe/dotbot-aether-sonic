package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class e implements l<Long> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ Long a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        long p4;
        p4 = fastParser.p(bufferedReader);
        return Long.valueOf(p4);
    }
}
