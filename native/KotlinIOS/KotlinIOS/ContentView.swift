//
//  ContentView.swift
//  KotlinIOS
//
//  Created by Ali Almesbah on 1/28/20.
//  Copyright © 2020 Thaman. All rights reserved.
//

import SwiftUI
import SharedCode

/*https://github.com/kotlin-hands-on/mpp-ios-android/issues/5*/

struct ContentView: View {
    var body: some View {
        Text(CommonKt.createApplicationScreenMessage())
    }
}

struct ContentView_Previews: PreviewProvider {
    static var previews: some View {
        ContentView()
    }
}
