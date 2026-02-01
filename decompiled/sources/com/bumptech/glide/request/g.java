package com.bumptech.glide.request;

import androidx.annotation.P;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.target.p;

/* loaded from: classes.dex */
public interface g<R> {
    boolean g(@P GlideException glideException, Object obj, p<R> pVar, boolean z3);

    boolean h(R r4, Object obj, p<R> pVar, DataSource dataSource, boolean z3);
}
