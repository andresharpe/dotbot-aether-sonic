package com.amazonaws.http.conn;

import com.amazonaws.logging.LogFactory;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ClientConnectionRequest;

/* loaded from: classes.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23628a = LogFactory.c(a.class);

    /* renamed from: com.amazonaws.http.conn.a$a, reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0202a implements InvocationHandler {

        /* renamed from: a, reason: collision with root package name */
        private final ClientConnectionManager f23629a;

        C0202a(ClientConnectionManager clientConnectionManager) {
            this.f23629a = clientConnectionManager;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            try {
                Object invoke = method.invoke(this.f23629a, objArr);
                if (invoke instanceof ClientConnectionRequest) {
                    return b.b((ClientConnectionRequest) invoke);
                }
                return invoke;
            } catch (InvocationTargetException e4) {
                a.f23628a.b("", e4);
                throw e4.getCause();
            }
        }
    }

    public static ClientConnectionManager b(ClientConnectionManager clientConnectionManager) {
        if (!(clientConnectionManager instanceof c)) {
            return (ClientConnectionManager) Proxy.newProxyInstance(a.class.getClassLoader(), new Class[]{ClientConnectionManager.class, c.class}, new C0202a(clientConnectionManager));
        }
        throw new IllegalArgumentException();
    }
}
