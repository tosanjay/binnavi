// Copyright 2011-2016 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.security.zynamics.binnavi.Gui.MainWindow.ProjectTree.Updaters;

/**
 * Interface for project tree updaters that want to select nodes that hold a given object.
 */
public interface INodeSelectionUpdater extends ITreeUpdater {
  /**
   * Sets the object held by the node to select.
   * 
   * @param object The object to search for.
   */
  void setObject(Object object);
}
