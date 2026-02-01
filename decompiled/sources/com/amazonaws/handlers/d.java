package com.amazonaws.handlers;

import com.amazonaws.AmazonClientException;
import com.amazonaws.util.ClassLoaderHelper;
import com.amazonaws.util.w;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class d {
    private List<e> a(String str, Class<?> cls) {
        ArrayList arrayList = new ArrayList();
        BufferedReader bufferedReader = null;
        try {
            try {
                InputStream resourceAsStream = getClass().getResourceAsStream(str);
                if (resourceAsStream == null) {
                    return arrayList;
                }
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(resourceAsStream, w.f24366b));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine == null) {
                            try {
                                bufferedReader2.close();
                            } catch (IOException unused) {
                            }
                            return arrayList;
                        }
                        String trim = readLine.trim();
                        if (!"".equals(trim)) {
                            Object newInstance = ClassLoaderHelper.l(trim, cls, getClass()).newInstance();
                            if (cls.isInstance(newInstance)) {
                                if (cls == e.class) {
                                    arrayList.add((e) newInstance);
                                } else if (cls == g.class) {
                                    arrayList.add(e.a((g) newInstance));
                                } else {
                                    throw new IllegalStateException();
                                }
                            } else {
                                throw new AmazonClientException("Unable to instantiate request handler chain for client.  Listed request handler ('" + trim + "') does not implement the " + cls + " API.");
                            }
                        }
                    } catch (Exception e4) {
                        e = e4;
                        bufferedReader = bufferedReader2;
                        throw new AmazonClientException("Unable to instantiate request handler chain for client: " + e.getMessage(), e);
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException unused2) {
                            }
                        }
                        throw th;
                    }
                }
            } catch (Exception e5) {
                e = e5;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public List<e> b(String str) {
        return a(str, e.class);
    }

    public List<e> c(String str) {
        return a(str, g.class);
    }
}
