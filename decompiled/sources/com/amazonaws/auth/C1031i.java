package com.amazonaws.auth;

import com.amazonaws.AmazonClientException;
import com.amazonaws.logging.LogFactory;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* renamed from: com.amazonaws.auth.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1031i implements InterfaceC1030h {

    /* renamed from: d, reason: collision with root package name */
    private static final com.amazonaws.logging.c f23436d = LogFactory.c(C1031i.class);

    /* renamed from: a, reason: collision with root package name */
    private List<InterfaceC1030h> f23437a = new LinkedList();

    /* renamed from: b, reason: collision with root package name */
    private boolean f23438b = true;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC1030h f23439c;

    public C1031i(InterfaceC1030h... interfaceC1030hArr) {
        if (interfaceC1030hArr != null && interfaceC1030hArr.length != 0) {
            for (InterfaceC1030h interfaceC1030h : interfaceC1030hArr) {
                this.f23437a.add(interfaceC1030h);
            }
            return;
        }
        throw new IllegalArgumentException("No credential providers specified");
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public InterfaceC1029g a() {
        InterfaceC1030h interfaceC1030h;
        if (this.f23438b && (interfaceC1030h = this.f23439c) != null) {
            return interfaceC1030h.a();
        }
        for (InterfaceC1030h interfaceC1030h2 : this.f23437a) {
            try {
                InterfaceC1029g a4 = interfaceC1030h2.a();
                if (a4.a() != null && a4.c() != null) {
                    f23436d.a("Loading credentials from " + interfaceC1030h2.toString());
                    this.f23439c = interfaceC1030h2;
                    return a4;
                }
            } catch (Exception e4) {
                f23436d.a("Unable to load credentials from " + interfaceC1030h2.toString() + ": " + e4.getMessage());
            }
        }
        throw new AmazonClientException("Unable to load AWS credentials from any provider in the chain");
    }

    public boolean b() {
        return this.f23438b;
    }

    public void c(boolean z3) {
        this.f23438b = z3;
    }

    @Override // com.amazonaws.auth.InterfaceC1030h
    public void refresh() {
        Iterator<InterfaceC1030h> it = this.f23437a.iterator();
        while (it.hasNext()) {
            it.next().refresh();
        }
    }
}
