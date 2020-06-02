// Copyright 2000-2020 JetBrains s.r.o. Use of this source code is governed by the Apache 2.0 license that can be found in the LICENSE file.

#include "jni.h"
#import "JavaRowAccessibility.h"
#import "JavaAccessibilityAction.h"
#import "JavaAccessibilityUtilities.h"
#import "ThreadUtilities.h"

@implementation JavaRowAccessibility

- (NSString *)getPlatformAxElementClassName {
    return @"PlatformAxRow";
}

@end

@implementation PlatformAxRow

- (NSInteger)accessibilityIndex {
    return [[self accessibilityParent] accessibilityIndexOfChild:self];
}

- (NSString *)accessibilityLabel {
    return [super accessibilityLabel];
}

- (BOOL)isAccessibilityEnabled
{
    return NO;
}

// to avoid warning (why?): method in protocol 'NSAccessibilityElement' not implemented
- (NSRect)accessibilityFrame
{
    return [super accessibilityFrame];
}

// to avoid warning (why?): method in protocol 'NSAccessibilityElement' not implemented
- (id)accessibilityParent
{
    return [super accessibilityParent];
}

@end
