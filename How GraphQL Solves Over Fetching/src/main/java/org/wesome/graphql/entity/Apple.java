package org.wesome.graphql.entity;

import java.util.List;

public record Apple(int appleId, String appleName, Boolean available, Float price, List<Vendor> vendors,
                    List<Store> stores) {
}