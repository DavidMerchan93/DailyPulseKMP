//
//  AboutScreen.swift
//  iosApp
//
//  Created by David Merchan on 28/12/23.
//  Copyright © 2023 orgName. All rights reserved.
//

import SwiftUI

struct AboutScreen: View {
    var body: some View {
        NavigationStack {
            AboutListView()
                .navigationTitle("About Device")
        }
    }
}

#Preview {
    AboutScreen()
}
