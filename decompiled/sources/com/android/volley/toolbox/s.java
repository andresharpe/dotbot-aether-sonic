package com.android.volley.toolbox;

import androidx.annotation.P;
import com.android.volley.ParseError;
import com.android.volley.p;
import java.io.UnsupportedEncodingException;
import org.json.JSONArray;
import org.json.JSONException;

/* loaded from: classes.dex */
public class s extends u<JSONArray> {
    public s(String str, p.b<JSONArray> bVar, @P p.a aVar) {
        super(0, str, null, bVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.android.volley.toolbox.u, com.android.volley.Request
    public com.android.volley.p<JSONArray> N(com.android.volley.l lVar) {
        try {
            return com.android.volley.p.c(new JSONArray(new String(lVar.f24494b, m.g(lVar.f24495c, "utf-8"))), m.e(lVar));
        } catch (UnsupportedEncodingException e4) {
            return com.android.volley.p.a(new ParseError(e4));
        } catch (JSONException e5) {
            return com.android.volley.p.a(new ParseError(e5));
        }
    }

    public s(int i4, String str, @P JSONArray jSONArray, p.b<JSONArray> bVar, @P p.a aVar) {
        super(i4, str, jSONArray != null ? jSONArray.toString() : null, bVar, aVar);
    }
}
