package com.amazonaws.http.conn;

import com.amazonaws.logging.LogFactory;
import com.amazonaws.metrics.AwsSdkMetrics;
import com.amazonaws.metrics.i;
import com.amazonaws.util.AWSServiceMetrics;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.conn.ClientConnectionRequest;

/* loaded from: classes.dex */
class b {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23630a = LogFactory.c(b.class);

    /* renamed from: b, reason: collision with root package name */
    private static final Class<?>[] f23631b = {ClientConnectionRequest.class, c.class};

    /* loaded from: classes.dex */
    private static class a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final ClientConnectionRequest f23632a;

        a(ClientConnectionRequest clientConnectionRequest) {
            this.f23632a = clientConnectionRequest;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                if ("getConnection".equals(method.getName())) {
                    i iVar = new i(AWSServiceMetrics.HttpClientGetConnectionTime);
                    try {
                        return method.invoke(this.f23632a, objArr);
                    } finally {
                        AwsSdkMetrics.u().b(iVar.a());
                    }
                }
                return method.invoke(this.f23632a, objArr);
            } catch (InvocationTargetException e4) {
                b.f23630a.b("", e4);
                throw e4.getCause();
            }
        }
    }

    b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ClientConnectionRequest b(ClientConnectionRequest clientConnectionRequest) {
        if (!(clientConnectionRequest instanceof c)) {
            return (ClientConnectionRequest) Proxy.newProxyInstance(b.class.getClassLoader(), f23631b, new a(clientConnectionRequest));
        }
        throw new IllegalArgumentException();
    }
}
