package com.bumptech.glide.load.engine;

import androidx.annotation.N;
import com.bumptech.glide.load.engine.cache.a;
import java.io.File;

/* loaded from: classes.dex */
class e<DataType> implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final com.bumptech.glide.load.a<DataType> f26007a;

    /* renamed from: b, reason: collision with root package name */
    private final DataType f26008b;

    /* renamed from: c, reason: collision with root package name */
    private final com.bumptech.glide.load.f f26009c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e(com.bumptech.glide.load.a<DataType> aVar, DataType datatype, com.bumptech.glide.load.f fVar) {
        this.f26007a = aVar;
        this.f26008b = datatype;
        this.f26009c = fVar;
    }

    @Override // com.bumptech.glide.load.engine.cache.a.b
    public boolean a(@N File file) {
        return this.f26007a.a(this.f26008b, file, this.f26009c);
    }
}
