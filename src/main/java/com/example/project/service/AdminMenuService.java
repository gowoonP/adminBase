package com.example.project.service;

import com.example.project.model.front.AdminMenu;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class AdminMenuService {
    public List<AdminMenu> getAdminMenu() {
        return Arrays.asList(
                AdminMenu.builder().title("고객관리").url("/pages/user").code("user").build(),
                AdminMenu.builder().title("관리자관리").url("/pages/adminuser").code("adminuser").build(),
                AdminMenu.builder().title("카테고리관리").url("/pages/category").code("category").build(),
                AdminMenu.builder().title("아이템관리").url("/pages/item").code("item").build(),
                AdminMenu.builder().title("구매정보관리").url("/pages/ordergroup").code("ordergroup").build(),
                AdminMenu.builder().title("업체관리").url("/pages/partner").code("partner").build()
        );
    }
}
