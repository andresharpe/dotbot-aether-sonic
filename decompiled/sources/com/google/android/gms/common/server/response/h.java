package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class h implements l<Boolean> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* bridge */ /* synthetic */ Boolean a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        boolean A3;
        A3 = fastParser.A(bufferedReader, false);
        return Boolean.valueOf(A3);
    }
}
