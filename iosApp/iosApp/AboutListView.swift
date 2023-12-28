//
//  AboutListView.swift
//  iosApp
//
//  Created by David Merchan on 28/12/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import shared
import SwiftUI

struct AboutListView: View {
    
    private struct RowItem: Hashable {
        let title: String
        let content: String
    }
    
    
    private let items: [RowItem] = {
        let platform = Platform()
        platform.logPlatformInfo()
        
        
        var result: [RowItem] = [
            .init(
                title: "OS",
                content: platform.osName
            ),
            .init(
                title: "OS version",
                content: platform.osVersion
            ),
            .init(
                title: "Device Model",
                content: platform.deviceModel
            ),
            .init(
                title: "Density",
                content: "@\(platform.density)"
            ),
            .init(
                title: "AppVersion",
                content: platform.appVersion
            )
        ]
        
        return result
    }()
    
    var body: some View {
        List {
            ForEach(items, id: \.self) { item in
                VStack(alignment: .leading) {
                    Text(item.title)
                        .font(.footnote)
                        .foregroundStyle(.secondary)
                    Text(item.content)
                        .font(.body)
                        .foregroundStyle(.primary)
                }
                .padding(.vertical, 4)
            }
        }
    }
}

#Preview {
    AboutListView()
}
