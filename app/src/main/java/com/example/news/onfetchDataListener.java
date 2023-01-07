package com.example.news;

import com.example.news.Models.Headlines;

import java.util.List;

public interface onfetchDataListener<ApiResponse> {
    void onFetchData(List<Headlines> list,String message);
    void onError(String message);
}
