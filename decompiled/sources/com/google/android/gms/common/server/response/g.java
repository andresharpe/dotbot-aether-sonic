package com.google.android.gms.common.server.response;

import androidx.annotation.P;
import com.google.android.gms.common.server.response.FastParser;
import java.io.BufferedReader;
import java.io.IOException;

/* loaded from: classes.dex */
final class g implements l<Double> {
    @Override // com.google.android.gms.common.server.response.l
    @P
    public final /* synthetic */ Double a(FastParser fastParser, BufferedReader bufferedReader) throws FastParser.ParseException, IOException {
        double l4;
        l4 = fastParser.l(bufferedReader);
        return Double.valueOf(l4);
    }
}
