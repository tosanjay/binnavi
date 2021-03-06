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

package com.google.security.zynamics.binnavi.Gui.GraphWindows.BottomPanel.InstructionHighlighter;

import com.google.security.zynamics.binnavi.disassembly.INaviInstruction;

/**
 * Encapsulates a single special instruction search result.
 */
public final class CSpecialInstruction {
  /**
   * Describes why the instruction is a special instruction.
   */
  private final ITypeDescription m_specialityType;

  /**
   * The special instructions found while searching.
   */
  private final INaviInstruction m_instruction;

  /**
   * Creates a new special instruction object.
   *
   * @param specialityType Describes why the instruction is a special instruction.
   * @param instruction The special instructions found while searching.
   */
  public CSpecialInstruction(
      final ITypeDescription specialityType, final INaviInstruction instruction) {
    m_specialityType = specialityType;
    m_instruction = instruction;
  }

  /**
   * Returns the special instruction.
   *
   * @return The special instruction.
   */
  public INaviInstruction getInstruction() {
    return m_instruction;
  }

  /**
   * Returns the reason why the instruction is special.
   *
   * @return The reason why the instruction is special.
   */
  public ITypeDescription getType() {
    return m_specialityType;
  }
}
