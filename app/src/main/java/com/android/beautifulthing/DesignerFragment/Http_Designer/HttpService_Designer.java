package com.android.beautifulthing.DesignerFragment.Http_Designer;


import com.android.beautifulthing.DesignerFragment.bean.DesignerBean;
import com.android.beautifulthing.DesignerFragment.bean.DesignerShopBean;
import com.android.beautifulthing.DesignerFragment.url.DataUrl;

import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by Administrator on 2016/9/6 0006.
 */
public interface HttpService_Designer {

    @GET(DataUrl.DESIGNER_GET_URL)
    Observable<DesignerBean> queryDesigner(
            @Query("page")int page,
            @Query("page_size")int size);

//    @GET("{basepath}/{url_path}")
//    Observable<DesignerDetilBean> queryDesigner2(
//            @Path("basepath")String basepath,
//            @Path("url_path") String url_path);

    @GET("{base_url}/{url_path}")
    Observable<DesignerShopBean> queryDesigner3(
            @Path("base_url") String base_url,
            @Path("url_path") String url_path);
}
