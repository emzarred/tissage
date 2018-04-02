package com.example.pc.emer;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by pc on 02/04/2018.
 */

public interface IRetro {
    @GET("/employe/getEmployeeByMatricule/{matricule}")
    Call<Employe> getEmployeeByMatricule(@Path("matricule") String matricule);


    @POST("/addEmployee")
    Call<Employe> addEmployee(@Body Employe employe);

    @POST("/deleteEmployee/{matricule}")
    Call<Employe> deleteEmployee(@Path("matricule") String matricule);

    @GET("/employe/getArticleByCode/{code}")
    Call<Article> getArticleByCode(@Path("code") String code);


    @POST("/addArticle")
    Call<Article> addArticle(@Body Article article);

    @POST("/deleteArticle/{code}")
    Call<Article> deleteAricle(@Path("code") String code);

    @GET("/arret/getArretByCode/{code}")
    Call<Arret> getArretByCode(@Path("code") String code);
}
