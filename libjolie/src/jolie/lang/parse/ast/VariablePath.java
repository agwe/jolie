/***************************************************************************
 *   Copyright (C) by Fabrizio Montesi                                     *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU Library General Public License as       *
 *   published by the Free Software Foundation; either version 2 of the    *
 *   License, or (at your option) any later version.                       *
 *                                                                         *
 *   This program is distributed in the hope that it will be useful,       *
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of        *
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the         *
 *   GNU General Public License for more details.                          *
 *                                                                         *
 *   You should have received a copy of the GNU Library General Public     *
 *   License along with this program; if not, write to the                 *
 *   Free Software Foundation, Inc.,                                       *
 *   59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.             *
 *                                                                         *
 *   For details about the authors of this software, see the AUTHORS file. *
 ***************************************************************************/

package jolie.lang.parse.ast;

import java.util.LinkedList;
import java.util.List;

import jolie.util.Pair;


public class VariablePath
{
	/*enum CommandType {
		INDEX, LAST
	}

	class NodeCommand {
		OLSyntaxNode expression;
		CommandType type;
		public NodeCommand( VariablePath.CommandType type, OLSyntaxNode expression )
		{
			this.type = type;
			this.expression = expression;
		}
		public CommandType type()
		{
			return type;
		}
		public OLSyntaxNode expression()
		{
			return expression;
		}
	}*/

	private String varId;
	private OLSyntaxNode varElement;
	private List< Pair< String, OLSyntaxNode > > path =
				new LinkedList< Pair< String, OLSyntaxNode > >();
	private OLSyntaxNode attribute = null;

	public VariablePath( String varId, OLSyntaxNode varElement )
	{
		this.varId = varId;
		this.varElement = varElement;
	}
	
	public void append( Pair< String, OLSyntaxNode > node )
	{
		path.add( node );
	}
	
	public String varId()
	{
		return varId;
	}
	
	public OLSyntaxNode varElement()
	{
		return varElement;
	}
	
	public List< Pair< String, OLSyntaxNode > > path()
	{
		return path;
	}
	
	public OLSyntaxNode attribute()
	{
		return attribute;
	}
	
	public void setAttribute( OLSyntaxNode attribute )
	{
		this.attribute = attribute;
	}
}
